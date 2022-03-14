package ¶þË¢Á¦¿Û;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2022/3/6 - 18:54
 **/
public class _3 {
    public  int lengthOfLongestSubstring(String s){
        if(s.length()==0||s.length()==1) return s.length();
        Map<Character,Integer> map=new HashMap<>();
        int max=1;
        int i=0;
        map.put(s.charAt(0),0);
        int j=1;
        while(j<s.length()){
            char n=s.charAt(j);
            if(map.containsKey(n)){
                i=Math.max(i,map.get(n)+1);
            }
            map.put(n,j);
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}
