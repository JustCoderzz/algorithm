package LeetcodeË¢Ìâ;

/**
 * @author lusir
 * @date 2022/4/28 - 23:43
 **/
public class _55 {
    public boolean canJump(int[] nums) {
        int right=nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (i>right) return false;
            right=Math.max(right,i+nums[i]);
        }
        return true;
    }
}
