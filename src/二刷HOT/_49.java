package ¶şË¢HOT;

import java.util.*;

/**
 * @author lusir
 * @date 2022/5/11 - 22:06
 **/
public class _49 {
    public  List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> res=new HashMap<>();
        for (String str:strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String s=new String(chars);
            List<String> list=res.getOrDefault(s,new ArrayList<>());
            list.add(str);
            res.put(s,list);
        }
        return new ArrayList<>(res.values());

    }
}
