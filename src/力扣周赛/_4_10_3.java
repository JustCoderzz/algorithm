package ¡¶ø€÷‹»¸;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author lusir
 * @date 2022/4/10 - 13:51
 **/
public class _4_10_3 {
    public int maximumProduct(int[] nums, int k) {
        Queue<Integer> primaryQ=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return  o1-o2;
            }
        });
        for (int item:nums){
            primaryQ.offer(item);
        }
        while (k!=0){
            primaryQ.offer(primaryQ.poll()+1);
            k--;
        }
        long sum=1;
        while (!primaryQ.isEmpty()) {
            sum=(sum*primaryQ.poll())%1000000007;
        }
        return (int) sum;
    }
}
