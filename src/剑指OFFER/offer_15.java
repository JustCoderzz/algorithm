package ½£Ö¸OFFER;

/**
 * @author lusir
 * @date 2021/11/9 - 20:12
 **/
public class offer_15 {
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            n&=(n-1);
            count++;
        }
        return count;
    }
}
