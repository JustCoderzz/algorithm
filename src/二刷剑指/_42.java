package 二刷剑指;

/**
 * @author lusir
 * @date 2022/4/14 - 11:06
 **/
public class _42 {
    public int maxSubArray(int[]nums)  {
//        dp[i]代表的是在长度位置上我们的子数组的和的最大值
        int []dp=new int[nums.length+1];
        dp[1]=nums[0];
        int res=nums[0];
        for (int i = 2; i <= nums.length; i++) {
//            dp[i]=Math.max(nums[i-1],dp[i-1]+nums[i-1])
            if (dp[i-1]>0) dp[i]=dp[i-1]+nums[i-1];
            else dp[i]=nums[i-1];
            res=Math.max(res,dp[i]);
        }
        return  res;
    }
}
