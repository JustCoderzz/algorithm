package ¶þË¢Á¦¿Û;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author lusir
 * @date 2022/3/9 - 21:58
 **/
public class _402 {
    public String removeKdigits(String num, int k) {
        StringBuilder str=new StringBuilder(num);
        Deque<Character> stack=new LinkedList<>();
        for(char c:num.toCharArray()){
            while(k>0&&!stack.isEmpty()&&c<stack.peek()){
                stack.pop();
                k--;
            }
            if(c!='0'||!stack.isEmpty()){
                stack.push(c);
                k--;
            }
        }
        while (k>0&&!stack.isEmpty()){
            stack.pop();
            k--;
        }
        while (!stack.isEmpty()){
            str.append(stack.pollLast());
        }
        return str.length()==0?"0":str.toString();
    }
}
