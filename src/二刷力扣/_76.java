package 二刷力扣;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2022/5/3 - 21:01
 **/
public class _76 {

    public String minWindow(String s,String t) {
//        定义两个哈希表来存储s和t串中每个字符的数量
        Map<Character,Integer> t_table=new HashMap<>();
        Map<Character,Integer> s_table=new HashMap<>();
//        遍历字符串t  找到每个字符的个数
        for (int i = 0; i < t.length(); i++) {
            t_table.put(t.charAt(i),t_table.getOrDefault(t.charAt(i),0)+1);
        }
//        定义一个已找到的字符数量
        int count=0;
//        定义最短字串
        int len=Integer.MAX_VALUE;
        String str="";
//        遍历字符串s
        int i=0;
        for (int j = 0; j < s.length(); j++) {
//            无论该字符是否存在于t_table中 我们都将他放入到s_table中
            s_table.put(s.charAt(j),s_table.getOrDefault(s.charAt(j),0)+1);
//            如果t字符串里有该字符我们判断在s_table中是否数量小于  若小于 则count++
            if (t_table.containsKey(s.charAt(j))&&s_table.get(s.charAt(j))<=t_table.get(s.charAt(j))) count++;
//            进行缩小窗口  防止不必要的字符串在我们的窗口中
            while (i<j&&(!t_table.containsKey(s.charAt(i))||s_table.get(s.charAt(i))>t_table.get(s.charAt(i)))){
                s_table.put(s.charAt(i),s_table.get(s.charAt(i))-1);
                i++;
            }
            if (count==t.length()&&j-i+1<len) {
                len=j-i+1;
                str=s.substring(i,j+1);
            }
        }
        return str;
    }
}
