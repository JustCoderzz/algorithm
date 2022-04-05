package ¶şË¢Á¦¿Û;

/**
 * @author lusir
 * @date 2022/4/5 - 9:37
 **/
public class _41 {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        for (int i=0;i<nums.length;i++) {
            if (nums[i]<=0) {
                nums[i]=n+1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            int num=Math.abs(nums[i]);
            if (num<=n) {
                nums[num-1]=-Math.abs(nums[num-1]);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0){
                return i+1;
            }
        }
        return n+1;
    }
}
