package ½£Ö¸OFFER;

/**
 * @author lusir
 * @date 2021/11/10 - 21:15
 **/
public class offer_39 {
    public int majorityElement(int[] nums) {
        Integer can=null;
        int count=0;
        for(int i:nums){
            if(count==0) can=i;
            count+=(i==can)?1:-1;
        }
        return can;

    }
}
