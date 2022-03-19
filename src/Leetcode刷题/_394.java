package LeetcodeÀ¢Ã‚;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author lusir
 * @date 2022/3/16 - 11:36
 **/
public class _394 {
    public String decodeString(String s) {
//        Stack<Character> stack=new Stack<>();
//        for(int i=0;i<s.length();i++){
//
//            if (s.charAt(i)!=']'){
//                stack.push(s.charAt(i));
//            }else{
//                StringBuilder sb=new StringBuilder();
//                while(!stack.isEmpty()&&stack.peek()!='['){
//                    sb.insert(0,stack.pop());
//                }
//                stack.pop();
//                StringBuilder count=new StringBuilder();
//                while(!stack.isEmpty()&&stack.peek()>='0'&&stack.peek()<='9'){
//                    count.insert(0,stack.pop());
//                }
//                int num=Integer.valueOf(count.toString());
//                for(int k=0;k<num;k++){
//                    for(int j=0;j<sb.length();j++){
//                        stack.push(sb.charAt(j));
//                    }
//                }
//            }
//        }
//        StringBuilder res=new StringBuilder();
//        while(!stack.isEmpty()){
//            res.insert(0,stack.pop());
//        }
//        return res.toString();
        Deque<Integer> stack_multi=new LinkedList<>();
        Deque<String> stack_res=new LinkedList<>();
        int multi=0;
        StringBuilder sb=new StringBuilder();
        for(Character c:s.toCharArray()){
            if(c=='['){
                stack_multi.add(multi);
                stack_res.add(sb.toString());
                multi=0;
                sb=new StringBuilder();
            }
            else  if(c==']'){
                StringBuilder tmp=new StringBuilder();
                int count=stack_multi.removeLast();
                for(int i=0;i<count;i++){
                    tmp.append(sb);
                }
                sb=new StringBuilder(stack_res.removeLast()+tmp);
            }
            else if(c>='0'&&c<='9') multi=multi*10+Integer.valueOf(c-'0');
            else sb.append(c);
        }
        return sb.toString();
    }
}
