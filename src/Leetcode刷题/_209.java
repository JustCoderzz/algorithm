package LeetcodeË¢Ìâ;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2022/3/14 - 22:02
 **/
public class _209 {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int r=0;
        int min=Integer.MAX_VALUE;
        int sum=0;
        while(r<nums.length){
            sum+=nums[r++];
            while (sum>=target){
                min=Math.min(min,r-l);
                sum-=nums[l++];
            }
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}
