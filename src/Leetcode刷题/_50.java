package LeetcodeË¢Ìâ;

/**
 * @author lusir
 * @date 2022/4/15 - 9:57
 **/
public class _50 {
    public double myPow(double x, int n) {
        if (x==0) return 0;
        if (n==0) return 1;
        if (n==1) return x;
        long b=n;
        if (b<0) {
            x=1/x;
            b=-b;
        }
        double res=1;
        while (b>0) {
            if ((b&1)==1) res*=x;
            x*=x;
            b>>=1;
        }
        return res;
    }
//public double myPow(double x, int n) {
//    if (x==0) return 0;
//    if (n==1) return x;
//    if (n<0) {
//        n=-n;
//        x=1/x;
//    }
//    if (n%2==0) {
//        return myPow(x*x,n/2);
//    }else{
//        return myPow(x*x,n/2)*x;
//    }
//}
}
