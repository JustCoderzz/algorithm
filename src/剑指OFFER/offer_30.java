package ½£Ö¸OFFER;

import java.util.Stack;

/**
 * @author lusir
 * @date 2021/11/20 - 10:23
 **/
public class offer_30 {
    class MinStack {
        Stack<Integer> stack1;
        Stack<Integer> stack2;
        /** initialize your data structure here. */
        public MinStack() {
            stack1=new Stack<>();
            stack2=new Stack<>();
        }

        public void push(int x) {
            stack1.add(x);
            if(stack2.isEmpty()||stack2.peek()>=x){
                stack2.add(x);
            }
        }

        public void pop() {
            if(stack1.pop().equals(stack2.peek())){
                stack2.pop();
            }
        }

        public int top() {
            return stack1.peek();
        }

        public int min() {
            return stack2.peek();
        }
    }
}
