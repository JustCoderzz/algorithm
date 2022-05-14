package ¶þË¢HOT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lusir
 * @date 2022/5/9 - 21:20
 **/
public class _17 {
    Map<Character,String> table;
    List<String> res=new ArrayList<>();
    StringBuilder sb=new StringBuilder();
    public List<String> letterCombinations(String digits) {
        if (digits.length()==0) return res;
        table=new HashMap<Character,String>(){{
            put('2',"abc");put('3',"def");
            put('4',"ghi");put('5',"jkl");
            put('6',"mno");put('7',"pqrs");
            put('8',"tuv");put('9',"wxyz");
        }};
        trace(0,digits);
        return res;
    }
    public  void trace(int index,String digits){
        if (index>=digits.length()){
            res.add(new String(sb));
            return;
        }
        String s = table.get(digits.charAt(index));
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            trace(index+1,digits);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
