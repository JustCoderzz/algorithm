package Leetcode刷题;

/**
 * @author lusir
 * @date 2022/3/9 - 15:52
 **/
public class _1155 {
    public int numRollsToTarget(int n, int k, int target) {
        if(n>target) return 0;
        if(target>n*k) return 0;
        //dp[i]代表的是组成数字i有多少种方法
        int []dp=new int[target+1];
        dp[n]=1;

        for(int m=n+1;m<=target;m++){
            for(int i=1;i<=k;i++){
                dp[m]+=dp[m-k]*k;
            }
        }
        return dp[target];
    }
}
