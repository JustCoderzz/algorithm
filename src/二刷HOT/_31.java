package ¶şË¢HOT;

import java.util.Arrays;

/**
 * @author lusir
 * @date 2022/5/10 - 20:44
 **/
public class _31 {
    public void nextPermutation(int[] nums) {
        for (int i = nums.length - 1; i >= 1; i--) {
            if (nums[i] > nums[i - 1]) {
                findTarget(nums, i - 1);
                reverseArr(nums, i, nums.length - 1);
                return;
            }
        }
        reverseArr(nums, 0, nums.length - 1);
    }

    public void swap(int[] nums, int i, int j) {
        nums[i] = nums[i] ^ nums[j];
        nums[j] = nums[i] ^ nums[j];
        nums[i] = nums[i] ^ nums[j];
    }

    public void reverseArr(int nums[], int i, int j) {
        while (i < j) {
            swap(nums, i++, j--);
        }
    }

    public void findTarget(int nums[], int L) {
        for (int i = nums.length - 1; i > L; i--) {
            if (nums[i] > nums[L]) {
                swap(nums, i, L);
                return;
            }
        }
    }
}
