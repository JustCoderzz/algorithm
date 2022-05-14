package ¶þË¢HOT;

/**
 * @author lusir
 * @date 2022/5/11 - 22:33
 **/
public class _55 {
    public boolean canJump(int[] nums) {
        int maxPos=nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (i>maxPos) return false;
            maxPos=Math.max(maxPos,nums[i]+i);
        }
        return true;
    }
}
