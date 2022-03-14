package HOT100题;

import java.util.Stack;

/**
 * @author lusir
 * @date 2021/11/27 - 8:51
 **/
public class HOT_155 {
    class MinStack {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
//    由栈的先进后出的特性，维持一个单挑递减栈，每次入栈2判断值是否小于栈顶元素，小于则添加，当栈
        public MinStack() {
            stack1=new Stack<>();
            stack2=new Stack<>();
        }

        public void push(int val) {
            stack1.push(val);
            if(stack2.isEmpty()||stack2.peek()>=val){
                stack2.push(val);
            }

        }

        public void pop() {
            if(stack2.peek().equals(stack1.pop())){
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
