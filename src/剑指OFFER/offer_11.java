package 剑指OFFER;

/**
 * @author lusir
 * @date 2021/11/7 - 10:34
 **/
public class offer_11 {
    public int minArray(int[] numbers) {
//        二分法 时间复杂度O(logn)
        int left=0;
        int right=numbers.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(numbers[mid]<numbers[right]){
                right=mid;
            }else if(numbers[mid]>numbers[right]){
                left=mid+1;
            }else{
                right-=1;
            }
        }
        return numbers[left];
    }
}
