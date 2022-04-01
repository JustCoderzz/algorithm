package ½£Ö¸offerÍ»»÷°æ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author lusir
 * @date 2022/4/1 - 10:41
 **/
public class _060 {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        PriorityQueue<int[]>  queue=new PriorityQueue<int []>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1]-o1[1];
            }
        });
        int pre=0;
        for (int i=1;i<=n;i++) {
            if (i==n||nums[i]!=nums[pre]) {
                queue.add(new int[]{nums[pre],i-pre});
                pre=i;
            }
        }
        int res[]=new int[k];
        for (int i=0;i<k;i++) {
          res[i]=  queue.poll()[0];
        }
        return res;
    }
}
