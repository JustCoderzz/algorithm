package ½£Ö¸offerÍ»»÷°æ;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lusir
 * @date 2022/4/2 - 12:27
 **/
public class _085 {

    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        backTrace(res,0,0,n,new StringBuilder());
        return res;
    }

    public void backTrace(List<String> res,int leftCount,int rightCount,int n,StringBuilder sb) {
        if (rightCount==n) {
            res.add(new String(sb));
            return;
        }
        if (leftCount<n) {
            sb.append('(');
            backTrace(res,leftCount+1,rightCount,n,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        if (rightCount<leftCount) {
            sb.append(')');
            backTrace(res,leftCount,rightCount+1,n,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
