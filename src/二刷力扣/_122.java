package ¶þË¢Á¦¿Û;

/**
 * @author lusir
 * @date 2022/5/7 - 10:52
 **/
public class _122 {
    public int maxProfit(int[] prices) {
        if (prices.length==0) return 0;
        int maxProfit=0;
        int n=prices.length;
        for (int i = 0; i < n-1; i++) {
            if (prices[i]<prices[i+1]){
                maxProfit+=prices[i+1]-prices[i];
            }
        }
        return maxProfit;
    }
}
