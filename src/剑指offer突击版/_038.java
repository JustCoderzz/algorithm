package ½£Ö¸offerÍ»»÷°æ;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author lusir
 * @date 2022/3/31 - 11:58
 **/
public class _038 {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack=new ArrayDeque<>();
        int []res=new int[temperatures.length];
        int n=temperatures.length;
        for (int i=n-1;i>=0;i--) {
            while (!stack.isEmpty()&&temperatures[stack.peek()]<=temperatures[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) res[i]=0;
            else res[i]=stack.peek()-i;
            stack.push(i);
        }
        return res;
    }
}
