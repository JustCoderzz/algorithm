package ½£Ö¸offerÍ»»÷°æ;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author lusir
 * @date 2022/4/20 - 20:41
 **/
public class _36 {
    public int evalRPN(String[] tokens) {
        Deque<String> stack=new ArrayDeque<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].length()==1&&!Character.isDigit(tokens[i].charAt(0))){
                String c=tokens[i];
                String b=stack.pop();
                String a=stack.pop();
                stack.push(compute(a,b,c)+"");
            }else{
                stack.push(tokens[i]);
            }
        }
        return Integer.parseInt(stack.pop());
    }
    public int compute(String a,String b,String operator) {
        int c=Integer.parseInt(a);
        int d=Integer.parseInt(b);
        switch (operator) {
            case "+":return c+d;
            case "-":return c-d;
            case "*":return c*d;
            case "/":return c/d;
        }
        return 0;
    }
}
