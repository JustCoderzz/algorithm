package HOT100题;

/**
 * @author lusir
 * @date 2022/3/2 - 15:46
 **/
public class Hot_312 {
    public int maxCoins(int[] nums) {
        //dp[i,j]代表的是 戳下标i到j的气球得到的最大硬币数量
        int n=nums.length;
        int[] points=new int[n+2];
        points[0]=1;
        points[n+1]=1;

        for (int i = 0; i < n; i++) {
            points[i+1]=nums[i];
        }
        int [][]dp=new int[n+2][n+2];
        for (int i=n;i>=0;i--) {
            for (int j=i+1;j<n+2;j++) {
                for (int k=i+1;k<j;k++) {
                    dp[i][j]=Math.max(dp[i][j],
                            dp[i][k]+dp[k][j]+points[i]*points[k]*points[j]
                            );
                }
            }
        }
        return dp[0][n+1];
    }
}
