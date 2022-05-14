package ¶şË¢HOT;

/**
 * @author lusir
 * @date 2022/5/10 - 23:34
 **/
public class _33 {
    public int search(int[] nums, int target) {
        int L=0;
        int R=nums.length-1;
        while ( L <= R) {
            int M=(L+R)/2;
            if (nums[M]==target) return M;
            if (nums[L]==nums[M]&&nums[M]==nums[R]){
                L++;R--;
            }else if (nums[M]>target&&(target>=nums[L]||nums[M]<=nums[R])) {
                R=M-1;
            }else if (target>nums[M]&&(target<=nums[R]||nums[M]>=nums[L])){
                L=M+1;
            }else if (target>=nums[L]) {
                R=M-1;
            }else L=M+1;
        }
        return -1;
    }
}
