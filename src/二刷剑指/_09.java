package ¶þË¢½£Ö¸;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author lusir
 * @date 2022/4/18 - 10:41
 **/
public class _09 {
    class CQueue {
            Deque<Integer> stack1;
            Deque<Integer> stack2;
        public CQueue() {
            stack1=new ArrayDeque<>();
            stack2=new ArrayDeque<>();
        }

        public void appendTail(int value) {
            stack1.push(value);
        }

        public int deleteHead() {
            if (stack2.isEmpty()&&stack1.isEmpty()) return -1;
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
           return  stack2.pop();
        }
    }
}
