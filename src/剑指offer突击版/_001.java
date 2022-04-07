package ½£Ö¸offerÍ»»÷°æ;

/**
 * @author lusir
 * @date 2022/4/7 - 10:58
 **/
public class _001 {
    public int divide(int a, int b) {
        int res=0;
        int k=1;
        if (a<0) {
            k*=-1;
            a=-a;
        }
        if (b<0) {
            k*=-1;
            b=-b;
        }
        int num=a;
        while (num>=b) {
            num-=b;
            res++;
        }
        return res*k;
    }
}
