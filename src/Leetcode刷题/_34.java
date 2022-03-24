package LeetcodeË¢Ìâ;

/**
 * @author lusir
 * @date 2022/3/24 - 9:14
 **/
public class _34 {
    public int[] searchRange(int[] nums, int target) {
        int leftIndex=binarySearch(nums,target);
        if(leftIndex>=nums.length||nums[leftIndex]!=target) return new int[]{-1,-1};
        int rightIndex=binarySearch(nums,target+1);
        return new int[]{leftIndex,rightIndex-1};
    }


    public int binarySearch(int[]nums,int target){
        int left=0;
        int right=nums.length-1;

        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]>=target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}
