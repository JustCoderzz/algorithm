package ��������¼;

/**
 * @author lusir
 * @date 2021/12/9 - 12:51
 **/
public class Code_714 {
    public int maxProfit(int[] prices, int fee) {
        int len = prices.length;
        // 0 : �ֹɣ����룩
        // 1 : ���ֹɣ��۳���
        // dp �����i��ֹ�/���ֹ� ��������ֽ�
        int[][] dp = new int[len][2];
        dp[0][0] = -prices[0];
        for (int i = 1; i < len; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] - prices[i]);
            dp[i][1] = Math.max(dp[i - 1][0] + prices[i] - fee, dp[i - 1][1]);
        }
        return Math.max(dp[len - 1][0], dp[len - 1][1]);
    }
}
