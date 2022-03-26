package LeetcodeÀ¢Ã‚;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * @author lusir
 * @date 2022/3/26 - 11:26
 **/
public class _150 {

    public int evalRPN(String[] tokens) {

        Deque<String> stack=new ArrayDeque<>();
        int n=tokens.length;
        for(int i=0;i<n;i++) {
            if (!Character.isDigit(tokens[i].charAt(tokens[i].length()-1))){
                int b=Integer.parseInt(stack.pop());
                int a=Integer.parseInt(stack.pop());
                stack.push(countNum(a,b,tokens[i]));
            }else stack.push(tokens[i]);
        }
        return Integer.parseInt(stack.pop());
    }

    public String countNum(int a,int b,String c) {
        int num=0;
        if (c.equals("+")) {
            num=a+b;
        }else if (c.equals("-")) {
            num=a-b;
        }else if (c.equals("*")) {
            num=a*b;
        }else num=a/b;
        return ""+num;
    }
}
