package ½£Ö¸OFFER;

/**
 * @author lusir
 * @date 2021/10/30 - 14:59
 **/
public class offer_10 {
    public int numWays(int n) {
        int fn[]=new int[n+1];
        if(n==0) return 1;
        if(n==1||n==2) return n;
        fn[1]=1;
        fn[2]=2;
        for(int i=3;i<n+1;i++){
            fn[i]=(fn[i-1]+fn[i-2])%1000000007;
        }
        return fn[n];
    }
}
