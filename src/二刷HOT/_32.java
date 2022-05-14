package ��ˢHOT;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author lusir
 * @date 2022/5/10 - 22:56
 **/
public class _32 {
    public int longestValidParentheses(String s) {

//        ����һ��ջ  ������(  ֱ����ջ
//        ������  ) ʱ ���ջ��Ϊ��  ���ջ���������Ч����
        int res=0;
        Deque<Integer> stack=new ArrayDeque<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='('||stack.size()==1) stack.push(i);
            else {
                stack.pop();
                res=Math.max(res,i-stack.peek());
            }
        }
        return res;
    }
}
