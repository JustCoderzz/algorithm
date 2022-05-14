package ¶þË¢Á¦¿Û;

/**
 * @author lusir
 * @date 2022/5/7 - 10:46
 **/
public class _121 {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int maxProfit=Integer.MIN_VALUE;
        int n=prices.length;
        for (int i = 0; i < n; i++) {
            if (prices[i]<min) {
                min=prices[i];
            }else {
                maxProfit=Math.max(maxProfit,prices[i]-min);
            }
        }
        return maxProfit==Integer.MAX_VALUE?0:maxProfit;
    }
}
