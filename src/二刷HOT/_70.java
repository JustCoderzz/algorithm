package ¶şË¢HOT;

/**
 * @author lusir
 * @date 2022/5/11 - 23:20
 **/
public class _70 {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        dp[1]=1;dp[0]=1;
        for (int i = 2; i <= n; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
