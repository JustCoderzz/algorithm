package ¶þË¢HOT;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2022/5/9 - 23:03
 **/
public class _20 {
    public boolean isValid(String s) {
        Deque<Character> stack=new ArrayDeque<>();
        Map<Character,Character> table=new HashMap<>();
        table.put(')','(');table.put('}','{');table.put(']','[');
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty()&&stack.peek()==table.get(s.charAt(i))) stack.pop();
            else stack.push(s.charAt(i));
        }
        return stack.isEmpty();
    }
}
