package Leetcode刷题;

/**
 * @author lusir
 * @date 2022/4/21 - 11:15
 **/
public class _1312 {
    public int minInsertions(String s) {
        int n=s.length();
//        dp[i][j]代表的是字符串从i到j成为回文字符串最少插入次数
        int [][]dp=new int[n+1][n+1];
        for (int i = 0; i <= n; i++) {
            dp[i][i]=0;
        }
        for (int i=n-1;i>=1;i--) {
            for (int j = i+1; j <= n; j++) {
                if (s.charAt(i-1)==s.charAt(j-1)) {
                    dp[i][j]=dp[i+1][j-1];
                }else{
                    dp[i][j]=Math.min(dp[i+1][j],dp[i][j-1])+1;
                }
            }
        }
        return dp[1][s.length()];
    }

}
