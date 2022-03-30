package ½£Ö¸offerÍ»»÷°æ;

/**
 * @author lusir
 * @date 2022/3/29 - 23:43
 **/
public class _009 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int i=0;
        int j=0;
        int sum=1;
        int res=0;
        while (j<nums.length) {
            sum*=nums[j];
            while (sum>=k&&i<j) {
                sum/=nums[i++];
            }
            if (i>=j) break;
            res+=j-i+1;
            j++;
        }
        return res;
    }
}
