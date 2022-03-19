package ¶þË¢Á¦¿Û;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lusir
 * @date 2022/3/14 - 13:55
 **/
public class _22 {

    List<String> res=new ArrayList<>();


    public List<String> generateParenthesis(int n){

        StringBuilder sb=new StringBuilder();
        backTrace(sb,n,0,0);
        return res;
    }

    public  void backTrace(StringBuilder sb,int n,int left,int right){
        if(sb.length()==2*n){
            res.add(sb.toString());
        }
        if(left<n){
            sb.append('(');
            backTrace(sb,n,left+1,right);
            sb.deleteCharAt(sb.length()-1);
        }
        if(right<left){
            sb.append(')');
            backTrace(sb,n,left,right+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
