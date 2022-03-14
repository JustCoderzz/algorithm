package 剑指OFFER;

import java.util.Arrays;

/**
 * @author lusir
 * @date 2021/11/16 - 19:44
 **/
public class offer_60 {
    public double[] dicesProbability(int n) {
//    f(n,x)代表的是n个骰子的和为x
        // f(n,x)等于f(n-1,x-1)+f(n-2,x-2)+f(1,
        double []dp=new double[6];
        Arrays.fill(dp,1/6.0);
        for(int i=2;i<=n;i++){//几个骰子
            double[] tmp=new double[5*i+1];
            for(int j=0;j<dp.length;j++){//已经递推得到的和 x-6之前的概率
                for(int k=0;k<6;k++){//递推x-6  到x的概率
                    tmp[j+k]+=dp[j]/6.0;
                }
            }
            dp=tmp;
        }
        return dp;


    }
}
