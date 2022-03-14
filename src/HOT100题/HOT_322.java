package HOT100Ã‚;

import java.util.Arrays;

/**
 * @author lusir
 * @date 2021/10/29 - 8:40
 **/
public class HOT_322 {
    public int coinChange(int[] coins, int amount) {
            int max=amount+1;
            int fn[] =new int[max];
            Arrays.fill(fn,max);
            fn[0]=0;
            for(int i=1;i<=amount;i++){
                for(int j=0;j<coins.length;j++){
                    if(coins[j]<=i){
                        fn[i]=Math.min(fn[i],fn[i-coins[j]]+1);
                    }
                }
            }
            return fn[amount]>amount?-1:fn[amount];








    }


}
