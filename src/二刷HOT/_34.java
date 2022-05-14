package ¶şË¢HOT;

/**
 * @author lusir
 * @date 2022/5/11 - 10:10
 **/
public class _34 {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length==0||nums==null) return new int[]{-1,-1};
        int beginIndex=binarySearch(nums,target);
        if (beginIndex>=nums.length||nums[beginIndex]!=target) return new int[]{-1,-1};
        int endIndex=binarySearch(nums,target+1);
        return new int[]{beginIndex,endIndex-1};
    }

    public int binarySearch(int nums[],int target) {
        int L=0;
        int R=nums.length-1;
        int res=nums.length;
        while (L<=R) {
            int M=(L+R)/2;
            if (nums[M]>=target) {
                res=M;
                R=M-1;
            }else{
                L=M+1;
            }
        }
        return res;
    }
}
