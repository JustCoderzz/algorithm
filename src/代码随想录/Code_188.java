package 代码随想录;

/**
 * @author lusir
 * @date 2021/12/9 - 10:53
 **/
public class Code_188 {
    public int maxProfit(int k, int[] prices) {
        int n=prices.length;
        if(n==0) return 0;
        /*
         * 定义 5 种状态:
         * 0: 没有操作, 1: 第一次买入, 2: 第一次卖出, 3: 第二次买入, 4: 第二次卖出
         */
//        dp[i][j]中 i表示第i天，j为 [0 - 4] 五个状态，dp[i][j]表示第i天状态j所剩最大现金。
        int[][]dp=new int[n][2*k+1];
        for(int i=1;i<=2*k;i++){
            dp[0][i]=-prices[0];
            i++;
        }


        for(int i=1;i<n;i++){
            for(int j=1;j<=2*k;j++){
                if((j&1)==1){
                    dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-1]-prices[i]);
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-1]+prices[i]);
                }

            }
        }
        return dp[n-1][2*k];
    }
}
