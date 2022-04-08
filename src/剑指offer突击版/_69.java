package ½£Ö¸offerÍ»»÷°æ;

/**
 * @author lusir
 * @date 2022/4/8 - 22:48
 **/
public class _69 {
    public int peakIndexInMountainArray(int[] arr) {

        int i=1;
        int j=arr.length-1;
        while (i<j) {
            int mid=(i+j)/2;
            if (arr[mid-1]<arr[mid]){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return i;
    }
}
