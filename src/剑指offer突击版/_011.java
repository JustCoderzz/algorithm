package ½£Ö¸offerÍ»»÷°æ;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2022/3/30 - 0:28
 **/
public class _011 {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int res=0;
        int sum=0;
        for (int i=0;i<nums.length;i++) {
            sum+=nums[i]==0?-1:1;
            if (map.containsKey(sum)) {
                res=Math.max(res,i-map.get(sum));
            }else {
                map.put(sum,i);
            }
        }
        return res;
    }
}
