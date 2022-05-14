package ��ˢ����;

/**
 * @author lusir
 * @date 2022/4/26 - 23:23
 **/
public class _718 {
    public int findLength(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
//        dp[i][j]���������i��β  j��β������������
        int[][] dp=new int[m+1][n+1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (nums1[i-1]==nums2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}
