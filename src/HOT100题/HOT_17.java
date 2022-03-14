package HOT100题;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lusir
 * @date 2021/10/29 - 14:16
 **/
public class HOT_17 {
    public List<String> letterCombinations(String digits) {
        List<String> list=new ArrayList<>();
        int n=digits.length();
        if(n==0) return list;
        Map<Character,String> table=new HashMap<Character,String>(){{
            put('2',"abc");
            put('3',"def");
            put('4',"ghi");
            put('5',"jkl");
            put('6',"mno");
            put('7',"pqrs");
            put('8',"tuv");
            put('9',"wxyz");
        }};
        backtrack(list,table,0,digits,new StringBuffer());
        return list;
    }
//      回溯法  用于寻找所有的可行解，若有一个解不可行，则舍去不可行的解
    public void backtrack(List<String> list,Map<Character,String> table,int index,String digits,StringBuffer stringBuffer){
        if(index==digits.length()){
            list.add(stringBuffer.toString());
        }else{
            char digit=digits.charAt(index);
            String str=table.get(digit);
            int length=str.length();
            for(int i=0;i<length;i++){
                stringBuffer.append(str.charAt(i));
                backtrack(list,table,index+1,digits,stringBuffer);
                stringBuffer.deleteCharAt(index);
            }
        }
    }
}
