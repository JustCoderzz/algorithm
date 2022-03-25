package LeetcodeÀ¢Ã‚;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2022/3/24 - 22:17
 **/
public class _3 {

    public  int lengthOfLongestSubstring(String s){

        if(s.length()==0||s.length()==1) return s.length();
        int i=0;
        int j=0;
        int max=1;
        Map<Character,Integer> map=new HashMap<>();
        while (j<s.length()){
            if (map.containsKey(s.charAt(j))){
                i=Math.max(map.get(j)+1,i);
            }
            map.put(s.charAt(j),j);
            j++;
            max=Math.max(max,j-i+1);
        }
        return max;

    }
}
