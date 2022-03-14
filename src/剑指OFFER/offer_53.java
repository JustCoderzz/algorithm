package 剑指OFFER;

/**
 * @author lusir
 * @date 2021/11/11 - 20:46
 **/
public class offer_53 {
    public int missingNumber(int[] nums) {
//        遇到递增有序就用  二分
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]==mid) i=mid+1;
            else j=mid-1;
        }
        return  i;
    }
}
