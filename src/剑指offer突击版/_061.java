package ½£Ö¸offerÍ»»÷°æ;

import java.util.*;

/**
 * @author lusir
 * @date 2022/4/9 - 16:32
 **/
public class _061 {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        Queue<int []> primaryQueue=new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]+o1[1]-o2[0]-o2[1];
            }
        });

        for (int i=0;i<nums1.length;i++) {
            for (int j=0;j<nums2.length;j++) {
                primaryQueue.offer(new int[]{nums1[i],nums2[j]});
            }
        }
        List<List<Integer>> res=new ArrayList<>();
        k=Math.min(k,primaryQueue.size());
        for (int i=0;i<k;i++) {
            List<Integer> tmp=new ArrayList<>();
            int[] arr = primaryQueue.poll();
            tmp.add(arr[0]);
            tmp.add(arr[1]);
            res.add(tmp);
        }
        return res;
    }
}
