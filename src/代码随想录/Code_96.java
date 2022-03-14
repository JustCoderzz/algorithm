package ��������¼;

/**
 * @author lusir
 * @date 2021/12/3 - 11:56
 **/
public class Code_96 {
    public int numTrees(int n) {
//        dp[i]������ǽ����Ϊi�Ķ���������������
        int []dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++){
                dp[i]+=dp[j-1]+dp[i-j];
            }
        }
        return dp[n];
    }
}
