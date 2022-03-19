package LeetcodeË¢Ìâ;

/**
 * @author lusir
 * @date 2022/3/14 - 19:19
 **/
public class _162 {
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;
        for (; left < right; ) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

}
