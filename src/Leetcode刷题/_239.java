package Leetcode刷题;

import java.util.*;

/**
 * @author lusir
 * @date 2022/3/17 - 11:43
 **/
public class _239 {
    public int[] maxSlidingWindow(int[] nums, int k) {

//        1.优先队列
//        Queue<int []> pQueue=new PriorityQueue<int []>(new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int [] o2) {
//                return o1[0]!=o2[0]?o2[0]-o1[0]:o2[1]-o1[1];
//            }
//        });
//
//        int res[]=new int[nums.length-k+1];
//        int j=0;
//        for(;j<k;j++) {
//            pQueue.offer(new int[]{nums[j],j});
//        }
//        res[0]=pQueue.peek()[0];
//        for (int i=k;i<nums.length;i++) {
//            pQueue.offer(new int[]{nums[i],i});
//            while (pQueue.peek()[1]<=i-k) {
//                pQueue.poll();
//            }
//            res[i-k+1]=pQueue.peek()[0];
//        }
//        return res;
//        单调队列
        int n=nums.length;
        Deque<Integer> deque=new LinkedList<>();
        int res[]=new int[n-k+1];
        for(int i=0;i<k;i++) {
            while (!deque.isEmpty()&&nums[i]>=nums[deque.peekLast()]){
                deque.pollLast();
            }
            deque.offer(i);
        }
        res[0]=nums[deque.peekFirst()];
        for(int i=k;i<n;i++) {
            while (!deque.isEmpty()&&nums[i]>=nums[deque.peekLast()]) {
                deque.pollLast();
            }

            deque.offerLast(i);
            while (deque.peekFirst()<i-k+1) {
                deque.pollFirst();
            }
            res[i-k+1]=nums[deque.peekFirst()];
        }
        return res;
    }
}
