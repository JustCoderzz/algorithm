package Leetcode刷题;

/**
 * @author lusir
 * @date 2022/4/21 - 15:30
 **/
public class _486 {
    public boolean PredictTheWinner(int[] nums) {
        int n=nums.length;
//        dp[i][j]代表的是从i到j能够得到最大的和
        int[][]dp=new int[n+1][n+1];
        int sum=0;
        for (int i = 1; i <= n; i++) {
            dp[i][i]=nums[i-1];
            sum+=nums[i-1];
        }
        for (int i=n-1;i>=1;i--) {
            for (int j=i+1;j<=n;j++) {
                dp[i][j]=Math.max(nums[j-1]-dp[i][j-1],nums[i-1]-dp[i+1][j]);
            }
        }
        return dp[1][n]>=0;
    }
}
