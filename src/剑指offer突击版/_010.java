package ½£Ö¸offerÍ»»÷°æ;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2022/3/30 - 0:19
 **/
public class _010 {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int res=0;
        map.put(0,1);
        for (int i=0;i<nums.length;i++) {
            sum+=nums[i];
            res+=map.getOrDefault(sum-k,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return res;
    }
}
