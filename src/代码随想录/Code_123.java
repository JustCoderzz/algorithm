package ��������¼;

/**
 * @author lusir
 * @date 2021/12/9 - 10:27
 **/
public class Code_123 {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        if(n==0) return 0;
        /*
         * ���� 5 ��״̬:
         * 0: û�в���, 1: ��һ������, 2: ��һ������, 3: �ڶ�������, 4: �ڶ�������
         */
//        dp[i][j]�� i��ʾ��i�죬jΪ [0 - 4] ���״̬��dp[i][j]��ʾ��i��״̬j��ʣ����ֽ�
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
