package 代码随想录;

/**
 * @author lusir
 * @date 2021/12/7 - 15:46
 **/
public class Code_198 {
    public int rob(int[] nums) {
//          dp[i]代表的是前i天偷窃的最大金额,包括第i天
//        dp[i]=Math.max(dp[i-1],dp[i-2]+num[i-1]
        int []dp=new int[nums.length+1];
        dp[0]=0;
        dp[1]=nums[0];
        for(int i=2;i<nums.length+1;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i-1]);
        }
        return dp[nums.length];
    }
}
