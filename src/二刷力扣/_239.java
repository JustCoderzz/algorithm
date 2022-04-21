package 二刷力扣;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author lusir
 * @date 2022/4/17 - 14:20
 **/
public class _239 {
    public int[] maxSlidingWindow(int []nums,int k) {

        int n=nums.length;
        if (n==0||k==0) return new int[0];
        int res[]=new int[n-k+1];

//        单调队列
        Deque<Integer> deque=new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty()&&nums[i]>=nums[deque.peekLast()]){
                deque.pollLast();
            }
            deque.offer(i);
        }
        res[0]=nums[deque.peekFirst()];
        for (int i = k; i < n; i++) {
            while (!deque.isEmpty()&&nums[i]>=nums[deque.peekLast()]) {
                deque.pollLast();
            }
            deque.addLast(i);
            while ((i-k+1>deque.peekFirst())) {
                deque.pollFirst();
            }
            res[i-k+1]=nums[deque.peekFirst()];
        }
        return res;
    }
}
