package 代码随想录;

import java.util.Arrays;

/**
 * @author lusir
 * @date 2021/12/7 - 14:24
 **/
public class Code_279 {
    public int numSquares(int n) {

        int []dp=new int[n+1];
//        dp[i]代表的凑成i的最少完全平方的个数
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=1;i*i<=n;i++){//遍历物品
            for(int j=i*i;j<=n;j++){//遍历背包
                if(dp[j-i*i]!=Integer.MAX_VALUE){
                    dp[j]=Math.min(dp[j],dp[j-i*i]+1);//判断是否需要从背包取出改物品
                }

            }
        }
        return dp[n];
    }
}
