package 二分法专题;

/**
 * @author lusir
 * @date 2022/4/16 - 12:53
 **/
public class offer_53 {

    public int search(int[] nums, int target) {
        return binarySearch(nums, target+1)-binarySearch(nums,target);
    }

    public  int binarySearch(int[]nums,int target) {
        int l=0;
        int r=nums.length-1;
        int res=-1;
        while (l<r) {
            int mid=(l+r)/2;
            if (nums[mid]<=target) {
                res=mid;
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return res;
    }
}
