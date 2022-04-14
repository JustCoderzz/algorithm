package LeetcodeÀ¢Ã‚;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author lusir
 * @date 2022/4/14 - 13:34
 **/
public class _155 {
    class MinStack {
        Deque<Integer> stack1;
        Deque<Integer> stack2;

        public MinStack() {
            stack1=new ArrayDeque<>();
            stack2=new ArrayDeque<>();
        }

        void push(int val) {
            stack1.push(val);
            if (stack2.isEmpty()||val<=stack2.peek()) {
                stack2.push(val);
            }
        }

        void pop() {
            if (stack2.peek().equals(stack1.pop())) {
                stack2.pop();
            }
        }
        int top() {
            return stack1.peek();
        }
        int getMin() {
            return stack2.peek();
        }
    }
}
