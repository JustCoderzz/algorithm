package 代码随想录;

import java.util.Arrays;

/**
 * @author lusir
 * @date 2021/12/6 - 13:12
 **/
public class Code_322 {
    public int coinChange(int[] coins, int amount) {
//        dp[i]代表凑成i的最少硬币个数
        int []dp=new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
//        遍历物品
        for(int i=0;i<coins.length;i++){
//       遍历背包大小
            for(int j=coins[i];j<=amount;j++){
                //只有dp[j-coins[i]]不是初始最大值时，该位才有选择的必要
                if(dp[j-coins[i]]!=Integer.MAX_VALUE){
                    dp[j]=Math.min(dp[j],dp[j-coins[i]]+1);
                }
            }
        }
        return dp[amount]==Integer.MAX_VALUE?-1:dp[amount];
    }
}
