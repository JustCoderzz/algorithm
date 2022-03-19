package LeetcodeÀ¢Ã‚;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author lusir
 * @date 2022/3/17 - 22:30
 **/
public class _151 {
    public String reverseWords(String s) {
        Deque<String> stack=new LinkedList<>();
        int i=0;
        int j=0;
        boolean flag=true;
        while(j<s.length()){
            if(s.charAt(j)!=' '&&flag){
                i=j;
                flag=false;
            }
            if((s.charAt(j)!=' '&&j==s.length()-1)||(s.charAt(j)!=' '&&s.charAt(j+1)==' '&&!flag)){
                String str=s.substring(i,j+1);
                stack.push(str);
                flag=true;
            }
            j++;
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
            sb.append(' ');
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}
