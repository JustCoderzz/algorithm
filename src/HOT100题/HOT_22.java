package HOT100Ã‚;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lusir
 * @date 2021/10/30 - 10:11
 **/
public class HOT_22 {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        StringBuilder stringBuilder=new StringBuilder();
        backtrack(n,res,stringBuilder,0,0);
        return res;
    }

    public void backtrack(int n, List<String> res,StringBuilder stringBuilder,int open,int close){
        if(stringBuilder.length()==2*n){
            res.add(stringBuilder.toString());
        }
        if(open<n){
            stringBuilder.append("(");
            backtrack(n,res,stringBuilder,open+1,close);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
        if(close<open){
            stringBuilder.append(")");
            backtrack(n,res,stringBuilder,open,close+1);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }

    }
}
