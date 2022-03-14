package ½£Ö¸OFFER;

/**
 * @author lusir
 * @date 2021/11/19 - 9:53
 **/
public class offer_66 {
    public int[] constructArr(int[] a) {
        if(a.length==0) return new int[0];
        int [] res=new int[a.length];
        int tmp=1;
        int right=1;
        res[0]=1;
        for(int i=1;i<a.length;i++){
            tmp*=a[i-1];
            res[i]=tmp;
        }
        for(int i=a.length-2;i>=0;i--){
            right*=a[i+1];
            res[i]*=right;
        }
        return  res;
    }
}
