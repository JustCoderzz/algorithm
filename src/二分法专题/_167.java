package 二分法专题;

import java.lang.annotation.Target;

/**
 * @author lusir
 * @date 2022/5/5 - 20:59
 **/
public class _167 {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        for (int i = 0; i < n; i++) {
            int index=binarySearch(numbers,i+1,n-1,target-numbers[i]);
            if (index!=-1)  return new int[]{i+1,index+1};
        }
        return new int[]{-1,-1};
    }
    public int binarySearch(int nums[], int left, int right,int target) {
        while (left<=right) {
            int mid=(right-left)/2+left;
            if (nums[mid]==target) return mid;
            else if (nums[mid]<target) {
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        return -1;
    }
}
