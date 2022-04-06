package 公司真题.腾讯音乐互娱;

/**
 * @author lusir
 * @date 2022/4/6 - 10:15
 **/
public class _4_6_1 {

    public int solution(int nums[],int k) {
//        dp[i][j]代表的是填充的数量为i个、值的范围为j个的方案数是
//        dp[i-1][j] + dp[i-1][j-1] +dp[i-1][j-2]+-----+dp[i-1][1]

        int n=nums.length;
        int [][]dp=new int[n+1][k+1];
        for (int i=1;i<n+1;i++) {
            dp[i][1]=1;
        }
        for (int i=1;i<k+1;i++) {
            dp[1][i]=i;
        }
        for (int i = 2  ; i <=n ; i++) {
            for (int j = 2  ; j <=k ; j++) {
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
                dp[i][j]%=1000000007;
            }
        }
        long res=1;
        int j=0;
        while (j<nums.length) {
            while (j<nums.length&&nums[j]!=0){
                j++;
            }
            if (j==n) break;
            int i=j;
            int left=j>0?nums[j-1] :1;
            while (j<nums.length&&nums[j]==0){
                j++;
            }
            int right=j<n?nums[j]:k;
            res=(res*dp[j-i][right-left+1])%1000000007;
        }
        return (int)res;
    }
}
