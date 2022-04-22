package Leetcode刷题;

/**
 * @author lusir
 * @date 2022/4/13 - 20:19
 **/
public class _887 {
    /**
     * 求得确定f得的最少操作次数
     * @param k   拥有的鸡蛋个数
     * @param n   楼层总高度
     * @return   最少操作次数
     */
    public int superEggDrop(int k, int n) {
        //代表的是测试j次最多能到多少层
        int[][]dp=new int[k+1][n+1];
        for(int j=1;j<=n;j++) {
            for(int i=1;i<=k;i++) {
//                dp[i-1][j-1] 鸡蛋碎了之后  dp[i][j-1] 鸡蛋没碎
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
////        i是鸡蛋数   j是楼层数
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
