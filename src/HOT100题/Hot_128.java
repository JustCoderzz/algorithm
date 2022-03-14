package HOT100Ìâ;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lusir
 * @date 2022/2/23 - 18:43
 **/
public class Hot_128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> num_set=new HashSet<>();
        for(int i:nums){
            num_set.add(i);
        }
        int res=0;
        for(int num:nums){
            if(!num_set.contains(num-1)){
                int cur=num;
                int count=1;
                while(num_set.contains(cur+1)){
                    count++;
                    cur++;
                }
                res=Math.max(res,count);
            }
        }
        return res;

    }

}
