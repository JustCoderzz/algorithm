package Leetcodeˢ��;

/**
 * @author lusir
 * @date 2022/3/17 - 10:10
 **/
public class _�ֽ�Բ������ {
//    0-12��13����  ��0�����ص�0�ж������߷�
    public  int backToOrigin(int n){
//        ��n����0  ����n-1����9+n-1����1
        int point=12;
        int [][]dp=new int[n+1][point+1];
//        dp[i][j]�����0������i�������j
        for(int i=0;i<n+1;i++){
            for(int j=0;j<=12;j++){
                dp[i][j]=dp[i-1][(j-1+point)%point]+dp[i-1][(j+1)%point];
            }
        }
        return dp[n][0];
    }
}
