package ½£Ö¸offerÍ»»÷°æ;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author lusir
 * @date 2022/3/30 - 22:39
 **/
public class _119 {
    public int longestConsecutive(int[] nums) {
//        Set<Integer> set=new HashSet<>();
//        for (int i:nums) {
//            set.add(i);
//        }
//        int res=0;
//        for (int i:nums) {
//            int count=0;
//            if (!set.contains(i-1)){
//                while (set.contains(i++)) {
//                    count++;
//                }
//            }
//            res=Math.max(res,count);
//        }
//        return res;
        Map<Integer,Integer> map=new HashMap<>();
        for (int i:nums) {
            map.put(i,i );
        }
        int res=0;
        for (int i:nums) {
            if (!map.containsKey(i-1)){
                int right=map.get(i);
                while (map.containsKey(right+1)) {
                    right=map.get(right+1);
                }
                map.put(i,right);
                res=Math.max(res,right-i+1);
            }
        }
        return res;
    }
}
