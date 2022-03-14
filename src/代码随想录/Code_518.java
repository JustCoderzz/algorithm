package ��������¼;

/**
 * @author lusir
 * @date 2021/12/6 - 10:34
 **/
public class Code_518 {
    public int change(int amount, int[] coins) {
//        dp[j]����Ĵճ�j�����������
        int []dp=new int[amount+1];
        dp[0]=1;
        for(int i=0;i<coins.length;i++){
            for( int j=coins[i];j<=amount;j++){
                dp[j]+=dp[j-coins[i]];
            }
        }
        return dp[amount];
    }
}
