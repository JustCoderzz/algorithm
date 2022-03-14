package ��������¼;

/**
 * @author lusir
 * @date 2021/12/9 - 10:53
 **/
public class Code_188 {
    public int maxProfit(int k, int[] prices) {
        int n=prices.length;
        if(n==0) return 0;
        /*
         * ���� 5 ��״̬:
         * 0: û�в���, 1: ��һ������, 2: ��һ������, 3: �ڶ�������, 4: �ڶ�������
         */
//        dp[i][j]�� i��ʾ��i�죬jΪ [0 - 4] ���״̬��dp[i][j]��ʾ��i��״̬j��ʣ����ֽ�
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
