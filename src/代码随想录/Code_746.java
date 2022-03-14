package 代码随想录;

/**
 * @author lusir
 * @date 2021/12/3 - 9:48
 **/
public class Code_746 {
    public int minCostClimbingStairs(int[] cost) {
//        dp[i]代表走到第i层的最少花费
        int n=cost.length;

        int fn[]=new int[n+1];
        fn[0]=0;
        fn[1]=0;

        for(int i=2;i<n+1;i++){
            fn[i]=Math.min(fn[i-1]+cost[i-1],fn[i-2]+cost[i-2]);
        }
        return fn[n];
    }
}
