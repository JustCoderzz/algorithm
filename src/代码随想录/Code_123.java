package 代码随想录;

/**
 * @author lusir
 * @date 2021/12/9 - 10:27
 **/
public class Code_123 {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        if(n==0) return 0;
        /*
         * 定义 5 种状态:
         * 0: 没有操作, 1: 第一次买入, 2: 第一次卖出, 3: 第二次买入, 4: 第二次卖出
         */
//        dp[i][j]中 i表示第i天，j为 [0 - 4] 五个状态，dp[i][j]表示第i天状态j所剩最大现金。
        int[][]dp=new int[n][5];
        dp[0][1]=-prices[0];
        dp[0][3]=-prices[0];
        for(int i=1;i<n;i++){
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
            dp[i][2]=Math.max(dp[i-1][2],dp[i-1][1]+prices[i]);
            dp[i][3]=Math.max(dp[i-1][3],dp[i-1][2]-prices[i]);
            dp[i][4]=Math.max(dp[i-1][4],dp[i-1][3]+prices[i]);
        }

        return dp[n-1][4];
    }
}
