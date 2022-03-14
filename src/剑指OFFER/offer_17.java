package ½£Ö¸OFFER;

/**
 * @author lusir
 * @date 2021/10/30 - 14:51
 **/
public class offer_17 {
    public int[] printNumbers(int n) {
        int m=1;
        for(int i=0;i<n;i++){
            m=m*10;
        }
        int arr[]=new int[m-1];
        for(int i=0;i<m-1;i++){
            arr[i]=i+1;
        }
        return arr;
    }
}
