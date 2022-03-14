package HOT100��;

import java.util.Stack;

/**
 * @author lusir
 * @date 2021/11/27 - 8:51
 **/
public class HOT_155 {
    class MinStack {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
//    ��ջ���Ƚ���������ԣ�ά��һ�������ݼ�ջ��ÿ����ջ2�ж�ֵ�Ƿ�С��ջ��Ԫ�أ�С������ӣ���ջ
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
