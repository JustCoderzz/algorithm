package 剑指OFFER;

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
//        k神的做法1
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

//        若要为顺子的话，必须直到最大的牌和最小的牌的插值要在5以内
//        这样的的话  小王就可以代替其他没出现的牌

//        K神的做法2
        Arrays.sort(nums);
        int left=0;
        for(int i=0;i<4;i++){
            if (nums[i]==0) left++;
            else if(nums[i]==nums[i+1]) return false;
        }
        return nums[4]-nums[left]<5;
    }
}
