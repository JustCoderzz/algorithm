package 代码随想录;

/**
 * @author lusir
 * @date 2021/12/8 - 16:26
 **/
public class Code_121 {
    public int maxProfit(int[] prices) {
        //动态规划
        int[][]dp=new int[prices.length][2];
        dp[0][0]=-prices[0];
        dp[0][1]=0;
        for(int i=1;i<prices.length;i++){
            dp[i][0]=Math.max(dp[i-1][0],-prices[i]);
            dp[i][1]=Math.max(dp[i-1][0]+prices[i],dp[i-1][1]);
        }
        return dp[prices.length-1][1];
    }

//    //贪心    明显速度块
//    public int maxProfit(int[] prices) {
//  int minprice = Integer.MAX_VALUE;
//  int maxprofit = 0;
//    for(int i = 0;i<prices.length;i++){
//          if(prices[i] < minprice){
//              minprice = prices[i];
//          }else if(prices[i] - minprice > maxprofit) {
//            maxprofit =  prices[i] - minprice;
//          }
//       }
//       return maxprofit;
//    }
}
