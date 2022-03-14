package ��������¼;

import java.util.Arrays;

/**
 * @author lusir
 * @date 2021/12/7 - 14:24
 **/
public class Code_279 {
    public int numSquares(int n) {

        int []dp=new int[n+1];
//        dp[i]����Ĵճ�i��������ȫƽ���ĸ���
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=1;i*i<=n;i++){//������Ʒ
            for(int j=i*i;j<=n;j++){//��������
                if(dp[j-i*i]!=Integer.MAX_VALUE){
                    dp[j]=Math.min(dp[j],dp[j-i*i]+1);//�ж��Ƿ���Ҫ�ӱ���ȡ������Ʒ
                }

            }
        }
        return dp[n];
    }
}
