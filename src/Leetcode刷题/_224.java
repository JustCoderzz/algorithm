package LeetcodeÀ¢Ã‚;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author lusir
 * @date 2022/4/12 - 19:13
 **/
public class _224 {
    public int calculate(String s) {
        Deque<Integer> ops=new LinkedList<>();
        ops.push(1);
        int sign=1;
        int res=0;
        int n=s.length();
        int i=0;
        while (i<n) {
            char c=s.charAt(i);
            if (c==' ') {
                i++;
            }else if (c=='+'){
                sign=ops.peek();
                i++;
            }else if (c=='-') {
                sign=-ops.peek();
                i++;
            }else if (c=='(') {
                ops.push(sign);
                i++;
            }else if (c==')') {
                ops.pop();
                i++;
            }else {
                long num=0;
                while (i<n&&Character.isDigit(s.charAt(i))) {
                    num=num*10+s.charAt(i)-'0';
                    i++;
                }
                res+=sign*num;
            }
        }
        return res;

    }



}
