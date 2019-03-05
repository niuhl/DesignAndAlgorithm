package com.stackQueue;

import java.util.Stack;

/**
 *
 * 实现一个带有getMin功能的栈
 * 实现一个特殊功能的栈，在实现栈的基本功能的基础上，在实现返回栈中最小的元素的操作。
 * 要求：
 * 1、pop、push、getMin的操作时间复杂度都是O(1)
 * 2、设计的栈类型可以使用现有的栈结构
 * @author niuhonglei
 * @date 2018/2/1
 */
public class GetMinStack {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public GetMinStack() {
        this.stackData = new Stack();
        this.stackMin = new Stack();
    }
    public void push(int e){
        stackData.push(e);
        if(stackMin.empty()){
            stackMin.push(e);
        }else {
            Integer min = stackMin.peek();
            if(min < e){
                stackMin.push(min);
            }else {
                stackMin.push(e);
            }
        }
    }
    public Integer pop(){
        if (stackData.isEmpty()){
            throw new RuntimeException("stack is empty");
        }
        stackMin.pop();
        return stackData.pop();
    }
    public Integer getMin(){
        if(stackData.empty()){
            throw new RuntimeException("stack is empty");
        }
        return stackMin.peek();
    }
}
