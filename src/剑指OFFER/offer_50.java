package 剑指OFFER;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2021/11/7 - 13:51
 **/
public class offer_50 {
    public char firstUniqChar(String s) {
//        自己写的   执行时间28ms
//        LinkedHashMap<Character,Integer> res=new LinkedHashMap<>();
//        for(int i=0;i<s.length();i++){
//            res.put(s.charAt(i),res.getOrDefault(s.charAt(i),0)+1);
//        }
//        for(Map.Entry<Character,Integer> entry:res.entrySet()){
//            if(entry.getValue()==1){
//                return entry.getKey();
//            }
//        }
//        return ' ';

//        别人的  执行时间7ms
        if (s.equals("")) return ' ';
        //创建‘a'-'z'的字典
        int[] target = new int[26];
        //第一次遍历，将字符统计到字典数组
        for (int i = 0; i < s.length(); i++) {
            target[s.charAt(i) - 'a']++;
        }
        //第二次遍历，从字典数组获取次数
        for (int i = 0; i < s.length(); i++) {
            if (target[s.charAt(i) - 'a'] == 1) return s.charAt(i);
        }

        return ' ';
    }
}
