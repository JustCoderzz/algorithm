package HOT100Ã‚;

/**
 * @author lusir
 * @date 2021/10/27 - 14:25
 **/
public class HOT_121 {
    public int maxProfit(int[] prices) {
        int max=0;
        int min=Integer.MAX_VALUE;
//        for(int i=0;i<prices.length;i++){
//            for(int j=i+1;j<prices.length;j++){
//                if(prices[j]-prices[i]>max){
//                    max=prices[j]-prices[i];
//                }
//            }
//        }
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }else if(prices[i]-min>max){
                max=prices[i]-min;
            }
        }




        return  max;
    }
}
