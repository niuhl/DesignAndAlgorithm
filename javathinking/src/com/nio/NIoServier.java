package com.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.Iterator;

/**
 *
 * @author niuhonglei
 * @date 2018/1/12
 */
public class NIoServier {
    public static void main(String[] args) throws IOException {
        //创建SocketChannel,监听8080端口
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.socket().bind(new InetSocketAddress(8080));
        //设置为非这阻塞模式
        serverSocketChannel.configureBlocking(false);
        //注册选择器
        Selector selector = Selector.open();
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        Handler handler = new Handler(1024);
        while (true){
            //等待请求，每次等待3秒，超过3秒后将2继续向下执行，如果成传入0或者不传入，一直阻塞
            if(selector.select(3000) == 0){
                System.out.println("等待超时。。。");
                continue;
            }
            System.out.println("处理请求");
            Iterator<SelectionKey> keyIterator = selector.selectedKeys().iterator();
            while (keyIterator.hasNext()){
                SelectionKey key = keyIterator.next();
                try {
                    if(key.isAcceptable()){
                        handler.handleAccept(key);
                    }
                    if(key.isReadable()){
                        handler.handleRead(key);
                    }
                }catch (Exception e){
                    keyIterator.remove();
                    continue;
                }
                keyIterator.remove();

            }
        }


    }
    private static class Handler{
        private int bufferSize = 1024;
        private String localCharset = "UTF-8";
        public Handler(){

        }
        public Handler(int bufferSize){
            this.bufferSize = bufferSize;
        }
        public Handler(String localCharset){
            this.localCharset = localCharset;
        }
        public Handler(int bufferSize,String localCharset){
            if(bufferSize>0){
                this.bufferSize = bufferSize;
            }
            if(localCharset != null){
                this.localCharset = localCharset;
            }
        }
        public void handleAccept(SelectionKey selectionKey) throws IOException {
            SocketChannel socketChannel = ((ServerSocketChannel)selectionKey.channel()).accept();
            socketChannel.configureBlocking(false);
            socketChannel.register(selectionKey.selector(), SelectionKey.OP_READ, ByteBuffer.allocate(bufferSize));
        }
        public void handleRead(SelectionKey selectionKey) throws IOException {
            //获取channel
            SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
            //获取buffer并重置
            ByteBuffer buffer = (ByteBuffer) selectionKey.attachment();
            buffer.clear();
            //没有读到内容就关闭
            if(socketChannel.read(buffer) == -1){
                socketChannel.close();
            }else {
                //待buffer转换为读状态
                buffer.flip();
                //将buffer中读到的值按localCharset格式编码后保存到receivedString
                String receiveString = Charset.forName(localCharset).newDecoder().decode(buffer).toString();
                System.out.println("receive data:"+receiveString);
                //返回数据给客户端
                String sendString = "recevie data:"+receiveString;
                buffer = ByteBuffer.wrap(sendString.getBytes(localCharset));
                socketChannel.write(buffer);
                socketChannel.close();
            }

        }
    }
}
