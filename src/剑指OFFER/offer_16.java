package 剑指OFFER;

/**
 * @author lusir
 * @date 2021/11/18 - 8:42
 **/
public class offer_16 {
    public double myPow(double x, int n) {
        if(x==0) return 0;
        double res=1.0;
        long b=n;
        if(n<0){
            b=-b;
            x=1/x;
        }
        while(b>0){
            if((b&1)==1) res*=x;
            x*=x;
            b>>=1;
        }
        return res;
    }
//    空间占用比上一个少
//    if(n == 0){
//            return 1;
//        }else if(n < 0){
//            return 1/x * myPow(1/x,-n-1);
//        }else if(n%2 == 0){
//            return myPow(x*x,n/2);
//        }else if(n%2 != 0){
//            return x * myPow(x*x,n/2);
//        }
//        return 0;
}
