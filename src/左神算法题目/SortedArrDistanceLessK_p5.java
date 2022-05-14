package �����㷨��Ŀ;

import �������Ŀ.LargestScoreFromStr;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author lusir
 * @date 2022/5/8 - 20:14
 **/
public class SortedArrDistanceLessK_p5 {
//    һ��������������飬�������������Ҳ����ÿ������������󲻻ᳬ��K����  �����Ǳ�֤ȫ������
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
