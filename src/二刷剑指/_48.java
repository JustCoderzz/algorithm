package ¶þË¢½£Ö¸;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2022/5/3 - 20:38
 **/
public class _48 {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int res=1;
        Map<Character,Integer> table=new HashMap<>();
        for (int j = 0; j < s.length(); j++) {
            if (table.containsKey(s.charAt(j))) {
                i=Math.max(i,table.get(s.charAt(j))+1);
            }
            table.put(s.charAt(j),j);
            res=Math.max(res,j-i+1);
        }
        return res;
    }
}
