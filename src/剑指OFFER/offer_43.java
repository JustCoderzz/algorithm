package 剑指OFFER;

/**
 * @author lusir
 * @date 2021/11/20 - 12:54
 **/
public class offer_43 {

//    cur>1   (a+1)*base
//    cur=1   a*base+1*(b+1)
//    cur<1   a*base

    public int countDigitOne(int n) {
        long base=1;
        int res=0;
        while (base<=n) {
            long a=n/base/10;
            long b=n%base;
            long cur=(n/base)%10;
            if (cur>1) {
                res+=(a+1)*base;
            }else if (cur<1) {
                res+=a*base;
            }else {
                res+=a*base+b+1;
            }
            base*=10;
        }
        return  res;
    }




















//    暴力解法
//public int countDigitOne(int n) {
//        int count=0;
//        for(int i=1;i<=n;i++){
//            count+=isNumber(i);
//        }
//        return count;
//    }
//
//    public int isNumber(int num){
//        int count=0;
//        while(num!=0){
//            count+=num%10==1?1:0;
//            num/=10;
//        }
//        return count;
//    }
}
