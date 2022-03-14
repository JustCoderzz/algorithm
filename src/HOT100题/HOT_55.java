package HOT100Ìâ;

/**
 * @author lusir
 * @date 2021/11/1 - 18:55
 **/
public class HOT_55 {
    public class Solution {
        public boolean canJump(int[] nums) {
//            Ì°ÐÄ
            int n = nums.length;
            int rightmost = 0;
            for (int i = 0; i < n; ++i) {
                if (i <= rightmost) {
                    rightmost = Math.max(rightmost, i + nums[i]);
                    if (rightmost >= n - 1) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

}
