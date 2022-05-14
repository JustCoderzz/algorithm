package 二分法专题;

/**
 * @author lusir
 * @date 2022/5/5 - 20:16
 **/
public class _153 {
    public int findMin(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        int res=nums[0];
        while (left<=right) {
            int mid=(right-left)/2+left;
            if (nums[mid]<=nums[right]){
                res=Math.min(res,nums[mid]);
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return res;
    }
}
