package ��������¼;

/**
 * @author lusir
 * @date 2021/12/3 - 10:38
 **/
public class Code_343 {
    public int integerBreak(int n) {
//        dp[i]�����������i��ֵ����˻�
        int []dp=new int[n+1];
        dp[0]=0;
        dp[1]=0;
        dp[2]=1;
        for(int i=3;i<=n;i++){
            for(int j=2;j<i;j++){
                dp[i]=Math.max(Math.max(j*dp[i-j],j*(i-j)),dp[i]);
            }
        }
        return dp[n];
    }
}
