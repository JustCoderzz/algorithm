package ¶þË¢HOT;

/**
 * @author lusir
 * @date 2022/5/11 - 22:29
 **/
public class _53 {
    public int maxSubArray(int[] nums) {
        int[]dp=new int[nums.length+1];
        int res=Integer.MIN_VALUE;
        for (int i = 1; i <= nums.length; i++) {
            dp[i]=Math.max(nums[i-1],dp[i-1]+nums[i-1]);
            res=Math.max(dp[i],res);
        }
        return res;
    }
}
