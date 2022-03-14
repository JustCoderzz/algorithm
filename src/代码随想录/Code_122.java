package 代码随想录;

/**
 * @author lusir
 * @date 2021/12/8 - 17:36
 **/
public class Code_122 {
    public int maxProfit(int[] prices) {
        int [][]dp=new int[prices.length][2];
        dp[0][0]=-prices[0];
        dp[0][1]=0;
        for(int i=1;i<prices.length;i++){
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]-prices[i]);
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]+prices[i]);
        }
        return dp[prices.length-1][1];
    }
//    贪心 更快
//    public int maxProfit(int[] prices) {
//    if (prices.length == 0) {
//            return 0;
//        }
//
//        int max = 0;
//        for (int i = 0; i < prices.length - 1; i++) {
//            if (prices[i] < prices[i+1]) {
//                max = max + prices[i+1] - prices[i];
//            }
//        }
//
//        return max;
//
//    }
}
