package ¶þË¢Á¦¿Û;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author lusir
 * @date 2022/3/11 - 11:59
 **/
public class _20 {
    public boolean isValid(String s) {
        Deque<Character> stack=new LinkedList<>();
        HashMap<Character,Character> map=new HashMap<Character,Character>(){
            {
                put(')','(');
                put(']','[');
                put('}','{');
            }
        };
        for(int i=0;i<s.length();i++){

            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }else if (map.get(s.charAt(i))==stack.peek()){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();

    }
}
