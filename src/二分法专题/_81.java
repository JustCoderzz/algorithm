package 二分法专题;

/**
 * @author lusir
 * @date 2022/5/5 - 19:20
 **/
public class _81 {
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        while (left<=right) {
            int mid=(right-left)/2+left;
            if (nums[mid]==target) return true;
//            进行对有重复的干扰项进行排除
            if (nums[left]==nums[mid]&&nums[mid]==nums[right]){
                left++;
                right--;
            }else if (nums[mid]>target&&(target>=nums[left]||nums[mid]<=nums[right])){
                right=mid-1;
            }else if (nums[mid]<target&&(target<=nums[right]||nums[mid]>=nums[left])){
                left=mid+1;
            }else if (target>=nums[left]){
                right=mid-1;
            }else left=mid+1;
        }
        return false;
    }
}
