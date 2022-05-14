package ¶þË¢HOT;

/**
 * @author lusir
 * @date 2022/5/13 - 20:26
 **/
public class _121 {
    public int maxProfit(int[] prices) {
        int minP=Integer.MAX_VALUE;
        int res=0;
        for (int p:prices) {
            if (p<minP) minP=p;
            res=Math.max(res,p-minP);
        }
        return res;
    }
}
