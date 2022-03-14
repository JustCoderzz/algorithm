package ��������¼;

import java.util.Arrays;

/**
 * @author lusir
 * @date 2021/12/6 - 13:12
 **/
public class Code_322 {
    public int coinChange(int[] coins, int amount) {
//        dp[i]����ճ�i������Ӳ�Ҹ���
        int []dp=new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
//        ������Ʒ
        for(int i=0;i<coins.length;i++){
//       ����������С
            for(int j=coins[i];j<=amount;j++){
                //ֻ��dp[j-coins[i]]���ǳ�ʼ���ֵʱ����λ����ѡ��ı�Ҫ
                if(dp[j-coins[i]]!=Integer.MAX_VALUE){
                    dp[j]=Math.min(dp[j],dp[j-coins[i]]+1);
                }
            }
        }
        return dp[amount]==Integer.MAX_VALUE?-1:dp[amount];
    }
}
