package HOT100题;

/**
 * @author lusir
 * @date 2021/12/17 - 20:51
 **/
public class Hot_221 {
    public int maximalSquare(char[][] matrix) {
        //dp[i][j]代表的是义matrix[i][j]为右下角的矩形的最大长
        int max=0;
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return max;
        }
        int m=matrix.length;
        int n=matrix[0].length;

        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if (matrix[i][j]=='1'){
                    if (i==0||j==0) dp[i][j]=1;
                    else{
                        dp[i][j]=Math.min(dp[i-1][j],Math.min(dp[i-1][j-1],dp[i][j-1]))+1;
                    }
                }else{
                    dp[i][j]=0;
                }
                max=Math.max(max,dp[i][j]);
            }
        }
        return max*max;
    }
}
