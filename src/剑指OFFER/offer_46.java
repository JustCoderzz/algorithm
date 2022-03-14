package 剑指OFFER;

/**
 * @author lusir
 * @date 2021/11/15 - 14:22
 **/
public class offer_46 {
    public int translateNum(int num) {
        //判断 第i位能否和第i-1位一起翻译  若可以的话  dp[i]=dp[i-1]+dp[i-2] 否则为  dp[i]=dp[i-1]
        //dp[i]代表的是以第i为结束的数字翻译的个数
        String str=String.valueOf(num);
        int a=1;
        int b=1;
        for(int i=2;i<=str.length();i++){
            String tmp=str.substring(i-2,i);
            int c=tmp.compareTo("10")>=0&&tmp.compareTo("25")>=0?a+b:b;
            a=b;
            b=c;
        }
        return b;
    }
}
