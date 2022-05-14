package ¶şË¢Á¦¿Û;

import sun.plugin2.os.windows.FLASHWINFO;

/**
 * @author lusir
 * @date 2022/4/24 - 20:41
 **/
public class _34 {
    public int[] searchRange(int[] nums, int target) {
        if (nums==null) return new int[0];
        int index_L = binarySearch(nums, target);
        if (index_L>=nums.length||nums[index_L]!=target) return new int[]{-1,-1};
        int index_R=binarySearch(nums,target+1);
        return new int[]{index_L,index_R-1};
    }

    public int binarySearch(int[]nums,int target) {
        int n=nums.length;
        int i=0;
        int j=n-1;
        int res=n;
        while (i<=j) {
            int mid=(i+j)/2;
            if (nums[mid]>=target) {
                res=mid;
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return res;
    }
}
