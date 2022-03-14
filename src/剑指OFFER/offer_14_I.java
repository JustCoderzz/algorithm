package 剑指OFFER;

/**
 * @author lusir
 * @date 2021/11/15 - 9:29
 **/
public class offer_14_I {
    public int cuttingRope(int n) {
//        长度为n的绳子的最大乘积是dp[n]
        int []dp=new int[n+1];

        for(int i=2;i<=n;i++){
            for(int j=1;j<=i/2;j++){//只需判断一半就行，相当于从左边剪和右边剪，两种
//                剪的长度为j-i，可以选择剪一次，也就对应j*(j-i)，反之则是j*dp[i-j]按最优方式继续剪，最后不断与得到的dp[i]做比较得到最优dp
                dp[i]=Math.max(Math.max(j*(i-j),j*dp[i-j]),dp[i]);
            }
        }
        return dp[n];
//        官方牛逼解法
//    if(n <= 3) return n - 1;
//        int a = n / 3, b = n % 3;
//        if(b == 0) return (int)Math.pow(3, a);
//        if(b == 1) return (int)Math.pow(3, a - 1) * 4;
//        return (int)Math.pow(3, a) * 2;
//
//
    }
}
