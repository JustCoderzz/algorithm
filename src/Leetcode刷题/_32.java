package LeetcodeË¢Ìâ;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author lusir
 * @date 2022/3/11 - 23:00
 **/
public class _32 {
    public int longestValidParentheses(String s) {
        int max=0;
        Deque<Integer> stack=new LinkedList<>();
        stack.push(-1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') stack.push(i);
            else{
                stack.pop();
                if(stack.isEmpty()) stack.push(i);
                else {
                    max=Math.max(max,i-stack.peek());
                }
            }
        }
        return max;

    }
}
