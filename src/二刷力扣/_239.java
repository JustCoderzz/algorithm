package ¶þË¢Á¦¿Û;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author lusir
 * @date 2022/4/17 - 14:20
 **/
public class _239 {
    public int[] maxSlidingWindow(int []nums,int k) {

        int n=nums.length;
        int res[]=new int[n-k+1];
        Deque<Integer> deque=new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty()&&nums[i]>=nums[deque.peekLast()]){
                deque.pollLast();
            }
            deque.offer(i);
        }
        res[0]=deque.peek();
        for (int i = k; i < n - k + 1; i++) {
            while (!deque.isEmpty()&&nums[i]>=nums[deque.peekLast()]) {
                deque.pollLast();
            }
        }
    }
}
