package 左神算法题目;

import 分享的题目.LargestScoreFromStr;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author lusir
 * @date 2022/5/8 - 20:14
 **/
public class SortedArrDistanceLessK_p5 {
//    一个几乎有序的数组，几乎有序的意义也就是每个数子排完序后不会超过K距离  并不是保证全局有序
    public static  void sortedArrDistanceLessK(int[]nums,int k) {

        PriorityQueue<Integer> heap=new PriorityQueue<>();
        int i=0;
        for (;i<=Math.min(k,nums.length);i++){
            heap.add(nums[i]);
        }
        int index=0;
        for (;i<nums.length;i++) {
            nums[index++]=heap.poll();
            heap.add(nums[i]);
        }
        while (!heap.isEmpty()){
            nums[index++]=heap.poll();
        }
    }
}
