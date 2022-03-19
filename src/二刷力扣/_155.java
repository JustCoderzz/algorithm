package ¶þË¢Á¦¿Û;

import java.util.Stack;

/**
 * @author lusir
 * @date 2022/3/16 - 9:35
 **/
public class _155 {
    class MinStack{
        Stack<Integer> stack1;
        Stack<Integer> stack2;
        public MinStack() {
            stack1=new Stack<>();
            stack2=new Stack<>();
        }

        public void push(int val) {
            stack1.push(val);
            if(stack2.isEmpty()){
                stack2.push(val);
            }else if(stack2.peek()>=val){
                stack2.push(val);
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

        public int getMin() {
            return stack2.peek();
        }
    }
}
