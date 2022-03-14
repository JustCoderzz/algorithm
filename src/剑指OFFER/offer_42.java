package ½£Ö¸OFFER;

/**
 * @author lusir
 * @date 2021/11/9 - 16:19
 **/
public class offer_42 {
    public int maxSubArray(int[] nums) {
        int []dp=new int[nums.length+1];
        dp[1]=nums[0];
        int max=nums[0];
        for(int i=2;i<=nums.length;i++){
            dp[i]=Math.max(nums[i-1],nums[i-1]+dp[i-1]);
            max=Math.max(max,dp[i]);
        }
        return max;
    }
}
