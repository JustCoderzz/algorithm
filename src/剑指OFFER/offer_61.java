package ��ָOFFER;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author lusir
 * @date 2021/11/22 - 10:47
 **/
public class offer_61 {
    public static void main(String[] args) {
        int []arr=new int[]{1,2,3,4,5};
        System.out.println(isStraight(arr));
    }
    public static boolean isStraight(int[] nums) {
//        k�������1
//        Set<Integer> set=new HashSet<>();
//        int max=0,min=14;
//        for(int n:nums){
//            if(n==0) continue;
//            max=Math.max(max,n);
//            min=Math.min(min,n);
//            if(set.contains(n)) return  false;
//            set.add(n);
//        }
//        return max-min<5;

//        ��ҪΪ˳�ӵĻ�������ֱ�������ƺ���С���ƵĲ�ֵҪ��5����
//        �����ĵĻ�  С���Ϳ��Դ�������û���ֵ���

//        K�������2
        Arrays.sort(nums);
        int left=0;
        for(int i=0;i<4;i++){
            if (nums[i]==0) left++;
            else if(nums[i]==nums[i+1]) return false;
        }
        return nums[4]-nums[left]<5;
    }
}
