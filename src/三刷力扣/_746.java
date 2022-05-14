package ÈýË¢Á¦¿Û;

/**
 * @author lusir
 * @date 2022/4/26 - 23:52
 **/
public class _746 {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int []dp=new int[n+1];
        dp[1]=0;
        for (int i = 2; i <= n; i++) {
            dp[i]=Math.min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]);
        }
        return dp[n];
    }
}
