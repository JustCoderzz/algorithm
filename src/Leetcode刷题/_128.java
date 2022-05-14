package LeetcodeË¢Ìâ;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2022/4/28 - 23:13
 **/
public class _128 {
    public int longestConsecutive(int[] nums) {

        Map<Integer,Integer> map=new HashMap<>();
        for (int num:nums) {
            map.put(num,1);
        }
        int res=0;
        for (int num:nums) {
            if (!map.containsKey(num-1)) {
                int right=map.get(num);
                while (map.containsKey(num+1)) {
                    right=map.get(right+1);
                }
                map.put(num,right);
                res=Math.max(res,right-num+1);
            }
        }
        return res;

    }
}
