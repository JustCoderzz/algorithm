package ½£Ö¸OFFER;

import java.util.Collections;

/**
 * @author lusir
 * @date 2021/11/9 - 19:49
 **/
public class offer_21 {
    public int[] exchange(int[] nums) {
        int left=0;

        int n=nums.length;
        int right=n-1;
        while(left<right){
            while(left<right&&(nums[left]&1)==1) left++;
            while (left<right&&(nums[right]&1)==0) right--;
            int tmp=nums[left];
            nums[left]=nums[right];
            nums[right]=tmp;
        }
        return nums;
    }
}
