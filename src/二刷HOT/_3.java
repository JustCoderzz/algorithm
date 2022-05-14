package ¶þË¢HOT;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2022/5/9 - 19:34
 **/
public class _3 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        Map<Character,Integer> table=new HashMap<>();
        int i=0;
        int res=Integer.MIN_VALUE;
        for (int j = 0; j < s.length(); j++) {
            if (table.containsKey(s.charAt(j))){
                i=Math.max(i,table.get(s.charAt(j))+1);
            }
            res=Math.max(res,j-i+1);
            table.put(s.charAt(j),j);
        }
        return res;
    }
}
