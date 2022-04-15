package ¶þË¢½£Ö¸;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lusir
 * @date 2022/4/15 - 9:40
 **/
public class _61 {
    public static boolean isStraight(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0) continue;
            min=Math.min(nums[i],min);
            max=Math.max(nums[i],max);
            if (set.contains(nums[i])) return false;
            else set.add(nums[i]);
        }
        return (max-min)<5;
    }
}
