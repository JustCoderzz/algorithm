package ¶şË¢Á¦¿Û;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2022/5/3 - 20:09
 **/
public class _1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> table=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (table.containsKey(target-nums[i])){
                return new int[]{i,table.get(target-nums[i])};
            }
            table.put(nums[i],i);
        }
        return new int[0];
    }
}
