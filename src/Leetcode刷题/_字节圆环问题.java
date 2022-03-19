package Leetcode刷题;

/**
 * @author lusir
 * @date 2022/3/17 - 10:10
 **/
public class _字节圆环问题 {
//    0-12共13个数  从0出发回到0有多少种走法
    public  int backToOrigin(int n){
//        走n步到0  等于n-1步到9+n-1步到1
        int point=12;
        int [][]dp=new int[n+1][point+1];
//        dp[i][j]代表从0出发走i步到达点j
        for(int i=0;i<n+1;i++){
            for(int j=0;j<=12;j++){
                dp[i][j]=dp[i-1][(j-1+point)%point]+dp[i-1][(j+1)%point];
            }
        }
        return dp[n][0];
    }
}
