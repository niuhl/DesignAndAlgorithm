package com.mystack;

/**
 * Created by niuhonglei on 2017/12/11.
 */
public class MyStack<E> implements IStack<E> {
    private Object[] arrs;
    private int top;
    private int max;
    public MyStack(int maxSize){
        arrs = new Object[maxSize];
        top = -1;
        max = maxSize;
    }


    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isMax() {
        return top == max-1;
    }

    @Override
    public boolean push(Object o) {
        if(isMax()){
            throw new RuntimeException("栈已满");
        }else {
            arrs[++top] = o;
        }
        return true;
    }

    @Override
    public E pop() {
        if(isEmpty()){
            throw new RuntimeException("空栈");
        }else {
            return (E)arrs[top--];
        }
    }

    @Override
    public E peek() {
        if(isEmpty()){
            throw new RuntimeException("空栈");
        }else {
            return (E)arrs[top];
        }
    }

    @Override
    public int getIndex(E o) {
        if(isEmpty()){
            return top;
        }else {
            for(int i=0;i<arrs.length;i++){
                if(arrs[i].equals(o)){
                    return i;
                }
            }
            return -1;
        }
    }

    @Override
    public int size() {
        return arrs.length;
    }

    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>(5);
        System.out.println(myStack.isEmpty());
        System.out.println(myStack.isMax());
        String st = "a,b,c,d,e";
        for(String string:st.split(",")){
            myStack.push(string);
        }
        System.out.println(myStack.isEmpty());
        System.out.println(myStack.isMax());
        System.out.println(myStack.top);
        System.out.println(myStack.pop());
        System.out.println(myStack.top);
        myStack.push("g");
        System.out.println(myStack.top);

    }
}
