package ��˾����.��Ѷ���ֻ���;

import java.util.logging.Level;

/**
 * @author lusir
 * @date 2022/4/6 - 20:20
 **/
public class _4_6_6 {
    /**
     *
     * @param n   ������ǳ���1�Ĵ���
     * @param k   �������k����
     * @return    ���ص�����С����������ֵ
     */
    public long minM (int n, int k) {
        int L=1;
        int h=getBits(n,k);
        int R= (int) Math.pow(k, h+1);
        long low=R;
        while (L<=R) {
            int mid=(R-L)/2+L;
            if (countS(mid,k)<n) {
                L=mid+1;
            }else{
                low=mid;
                R=mid-1;
            }
        }
        return low;
    }

    int countS(int n,int k) {
        long base=1;
        int res=0;
        while (base<=n) {
            long a=n/base/k;
            long b=n%base;
            long cur=(n/base)%k;
            if (cur>1) {
                res+=(a+1)*base;
            }else if (cur<1) {
                res+=a*base;
            }else {
                res+=a*base+b+1;
            }
            base*=k;
        }
        return  res;
    }
    private int getBits(long num,int k) {
        int len=0;
        while (num>0) {
            num/=k;
            len++;
        }
        return len;
    }
}
