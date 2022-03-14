package ��������¼;

/**
 * @author lusir
 * @date 2021/12/9 - 11:52
 **/
public class Code_309 {
    public int maxProfit(int[] prices) {
        int[][]dp=new int[prices.length][4];
        int n=prices.length;
//        0 ��������״̬   1����ǰ���������״̬  2�����������״̬   3�����䶳��
        dp[0][0]=-prices[0];
        for(int i=1;i<prices.length;i++){
            dp[i][0]=Math.max(dp[i-1][3]-prices[i],Math.max(dp[i-1][0],dp[i-1][1]-prices[i]));
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][3]);
            dp[i][2]=dp[i-1][0]+prices[i];
            dp[i][3]=dp[i-1][2];
        }
        return Math.max(dp[n - 1][3],Math.max(dp[n - 1][1], dp[n - 1][2]));
    }
}
