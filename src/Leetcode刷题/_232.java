package LeetcodeÀ¢Ã‚;

import java.util.Stack;

/**
 * @author lusir
 * @date 2022/3/14 - 18:54
 **/
public class _232 {
    class MyQueue {
        Stack<Integer> stack1;
        Stack<Integer> stack2;
        public MyQueue() {
            stack1=new Stack<>();
            stack2=new Stack<>();
        }

        public void push(int x) {
            stack1.push(x);

        }

        public int pop() {
            if(stack2.isEmpty()){
                while(!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
            }
           return stack2.pop();

        }

        public int peek() {
            if(stack2.isEmpty()){
                while(!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
            }
           return stack2.peek();
        }

        public boolean empty() {
            return stack1.isEmpty()&&stack2.isEmpty();
        }
    }
}
