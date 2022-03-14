package ��������¼;

/**
 * @author lusir
 * @date 2021/12/3 - 10:10
 **/
public class Code_63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        if(obstacleGrid[0][0]==1) return 0;
        int[][] dp=new int[m+1][n+1];
        dp[1][1]=1;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(i==1&&j==1) continue;
                if (obstacleGrid[i-1][j-1]==1) dp[i][j]=0;

                else dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m][n];
    }
}
