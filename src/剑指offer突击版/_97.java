package ½£Ö¸offerÍ»»÷°æ;

/**
 * @author lusir
 * @date 2022/4/20 - 22:34
 **/
public class _97 {
    public int numDistinct(String s, String t) {
        int m=s.length();
        int n=t.length();
        if (m<n) return 0;
        int[][] dp=new int[m+1][n+1];
        for (int i = 0; i <= m; i++) {
            dp[i][0]=1;
        }
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (s.charAt(i-1)==t.charAt(j-1)) {
                    dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[m][n];
    }
}
