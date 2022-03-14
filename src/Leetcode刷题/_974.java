package LeetcodeË¢Ìâ;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2022/3/3 - 15:50
 **/
public class _974 {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int res=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int m=(sum%k+k)%k;
            int t=map.getOrDefault(m,0);
            res+=t;
            map.put(sum,t+1);
        }
        return res;
    }
}
