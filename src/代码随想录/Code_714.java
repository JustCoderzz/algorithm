package 代码随想录;

/**
 * @author lusir
 * @date 2021/12/9 - 12:51
 **/
public class Code_714 {
    public int maxProfit(int[] prices, int fee) {
        int len = prices.length;
        // 0 : 持股（买入）
        // 1 : 不持股（售出）
        // dp 定义第i天持股/不持股 所得最多现金
        int[][] dp = new int[len][2];
        dp[0][0] = -prices[0];
        for (int i = 1; i < len; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] - prices[i]);
            dp[i][1] = Math.max(dp[i - 1][0] + prices[i] - fee, dp[i - 1][1]);
        }
        return Math.max(dp[len - 1][0], dp[len - 1][1]);
    }
}
