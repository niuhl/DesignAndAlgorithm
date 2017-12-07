package com.ResponsibilityChainPattern;

/**
 * Created by niuhonglei on 2017/9/5.
 */
public abstract class Handler {
    private Handler nextHandler;
    public final Response handleMessage(Request request){
        Response response = null;
        if(this.getHandlerLevel().equals(request.getRequestLevel())){
            response = this.echo(request);
        }else {
            if(this.nextHandler != null){
                response = this.nextHandler.echo(request);
            }else {
                //没有合适的处理者
            }
        }
        return response;
    }
    public void setNextHandler(Handler _handler){
        this.nextHandler = _handler;
    }
    protected abstract Level getHandlerLevel();
    protected abstract Response echo(Request request);
}
