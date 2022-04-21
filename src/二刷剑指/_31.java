package ¶þË¢½£Ö¸;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author lusir
 * @date 2022/4/18 - 12:28
 **/
public class _31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack=new ArrayDeque<>();
        int j=0;
        for (int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            while (!stack.isEmpty()&&stack.peek()==popped[j]) {
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
}
