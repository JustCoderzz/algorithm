package Leetcodeˢ��;

/**
 * @author lusir
 * @date 2022/4/13 - 20:19
 **/
public class _887 {
    /**
     * ���ȷ��f�õ����ٲ�������
     * @param k   ӵ�еļ�������
     * @param n   ¥���ܸ߶�
     * @return   ���ٲ�������
     */
    public int superEggDrop(int k, int n) {
        //������ǲ���j������ܵ����ٲ�
        int[][]dp=new int[k+1][n+1];
        for(int j=1;j<=n;j++) {
            for(int i=1;i<=k;i++) {
//                dp[i-1][j-1] ��������֮��  dp[i][j-1] ����û��
                dp[i][j]=1+dp[i-1][j-1]+dp[i][j-1];
                if(dp[i][j]>=n) return j;
            }
        }
        return n;
//        int [][]dp=new int[k+1][n+1];
//
//        for (int i = 1; i <=k; i++) {
//            dp[i][1]=1;
//        }
//        for (int i=1;i<=n;i++) {
//            dp[1][i]=i;
//        }
////        i�Ǽ�����   j��¥����
//        for (int i = 2; i <=k; i++) {
//            for (int j = 2; j <=n; j++) {
//                if (i>j) {
//                    dp[i][j]=dp[i-1][j];
//                }else{
//                    int left=1;
//                    int right=j;
//                    int res=left;
//                    while (left<=right) {
//                        int mid=(left+right)/2;
//                        int f=dp[i][j-mid];
//                        int g=dp[i-1][mid-1];
//                        if (f>=g) {
//                            res=mid;
//                            right=mid-1;
//                            if (f==g){
//                                break;
//                            }
//                        }else{
//                            left=mid+1;
//                        }
//                    }
//                    dp[i][j]=Math.max(dp[i-1][res-1],dp[i][j-res])+1;
//                }
//            }
//        }
//        return dp[k][n];
    }
}
