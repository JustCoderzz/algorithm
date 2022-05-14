package 二刷HOT;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2022/5/13 - 20:40
 **/
public class _128 {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Integer> table=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            table.put(nums[i],1);
        }
        int res=Integer.MIN_VALUE;
        for (int num:nums) {
            if (!table.containsKey(num-1)) {
//                为了去重  因为可能会出现很多最小的值的情况
                int right=table.get(num);
                while (table.containsKey(right+1)){
                    right=right+1;
                }
                table.put(num,right);
                res=Math.max(res,right-num+1);
            }
        }
        return res;
    }
}
