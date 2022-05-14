package 二刷HOT;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2022/5/9 - 19:15
 **/
public class _1 {
    public int[] twoSum(int[] nums, int target) {
//        记录每个数对应的下标
        Map<Integer,Integer> table=new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
//            如果找到和为target则直接返回  否则就加入到table中
            if (table.containsKey(target-nums[i])){
                return new int[]{table.get(target-nums[i]),i};
            }
            table.put(nums[i],i);
        }
//        如果找不到  则说明没有
        return new int[]{-1,-1};
    }
}
