package ¶þË¢HOT;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2022/5/12 - 20:17
 **/
public class _76 {
    public String minWindow(String s, String t) {

        Map<Character,Integer> t_table=new HashMap<>();
        Map<Character,Integer> s_table=new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            t_table.put(t.charAt(i),t_table.getOrDefault(t.charAt(i),0)+1);
        }
        int len=Integer.MAX_VALUE;
        String str="";
        int count=0;
        int L=0;
        for (int i = 0; i < s.length(); i++) {
            s_table.put(s.charAt(i),s_table.getOrDefault(s.charAt(i),0)+1);
            if (t_table.containsKey(s.charAt(i))&&s_table.get(s.charAt(i))<=t_table.get(s.charAt(i))) count++;
            while (L<i&&(!t_table.containsKey(s.charAt(L))||s_table.get(s.charAt(L))>t_table.get(s.charAt(L)))){
                s_table.put(s.charAt(L),s_table.get(s.charAt(L))-1);
                L++;
            }
            if (count==t.length()) {
                if (i-L+1<len){
                    len=i-L+1;
                    str=s.substring(L,i+1);
                }
            }
        }
        return str;
    }
}
