package HOT100Ã‚;

import java.util.*;

/**
 * @author lusir
 * @date 2022/3/1 - 20:56
 **/
public class Hot_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            char[] chars=str.toCharArray();
            Arrays.sort(chars);
            String s=new String(chars);
            List<String> list=map.getOrDefault(s,new ArrayList<String>());
            list.add(s);
            map.put(s,list);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
