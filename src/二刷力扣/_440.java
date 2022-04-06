package ¶þË¢Á¦¿Û;

/**
 * @author lusir
 * @date 2022/4/5 - 13:09
 **/
public class _440 {
    public int findKthNumber(int n, int k) {
        long cur=1;
        k-=1;
        while (k>0) {
            int total=getCount(cur,n);
            if (total>k){
                k--;
                cur*=10;
            }else{
                k-=total;
                cur++;
            }
        }
        return (int) cur;
    }
    public int getCount(long cur,int n) {
        long next=cur+1;
        long sum=0;
        while (cur<=n){
            sum+=Math.min(next-cur,n-cur+1);
            cur*=10;
            next*=10;
        }
        return (int) sum;
    }
}
