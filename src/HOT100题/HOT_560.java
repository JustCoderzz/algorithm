package HOT100Ìâ;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2021/11/30 - 16:27
 **/
public class HOT_560 {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int pre=0;
        Map<Integer,Integer> dic=new HashMap<>();
        dic.put(0,1);
        for(int i=0;i<nums.length;i++){
            pre+=nums[i];
            if(dic.containsKey(pre-k)){
                count+=dic.get(pre-k);
            }
            dic.put(pre,dic.getOrDefault(pre,0)+1);
        }
        return count;


    }
}
