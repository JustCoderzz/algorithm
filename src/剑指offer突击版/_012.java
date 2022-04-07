package ½£Ö¸offerÍ»»÷°æ;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2022/4/7 - 15:47
 **/
public class _012 {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for (int num:nums) {
            sum+=num;
        }
        int i=0;
        int leftSum=0;
        while (i<nums.length) {
            int rightSum=sum-leftSum-nums[i];
            if (leftSum==rightSum) return i;
            leftSum+=nums[i];
            i++;
        }
        return -1;
    }
}
