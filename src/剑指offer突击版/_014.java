package ½£Ö¸offerÍ»»÷°æ;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2022/3/30 - 11:05
 **/
public class _014 {
    public boolean checkInclusion(String s1, String s2) {

        Map<Character,Integer> s1_map=new HashMap<>();
        Map<Character,Integer> s2_map=new HashMap<>();
        int count=0;
        for (char c:s1.toCharArray()) {
            s1_map.put(c,s1_map.getOrDefault(c,0)+1);
        }
        int j=0;
        char[] chars = s2.toCharArray();
        while (j<chars.length) {
            char c=chars[j];
            if (s1_map.containsKey(c)) {
                int n1=s1_map.get(c);
                int n2=s2_map.getOrDefault(c,0);
                if (n1>n2) {
                    count++;
                    s2_map.put(c,n2+1);
                }
                if (count==s1.length()) return true;
            }else {
                count=0;
            }
            j++;
        }
        return false;

    }
}
