package 二刷HOT;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lusir
 * @date 2022/5/10 - 20:27
 **/
public class _22 {
    List<String> res=new ArrayList<>();
    StringBuilder sb=new StringBuilder();
    public List<String> generateParenthesis(int n) {
        traceToGenPar(n,0,0);
        return res;
    }
    public void traceToGenPar(int n,int leftPar,int rightPar) {
//        优先生成左括号   当右括号少于左括号时生成右括号
//        当右括号的数量等于n时  说明生成完成加入到结果集中
        if (rightPar==n){
            res.add(new String(sb));
            return;
        }
        if (leftPar<n){
            sb.append('(');
            traceToGenPar(n,leftPar+1,rightPar);
            sb.deleteCharAt(sb.length()-1);
        }
        if (rightPar<leftPar){
            sb.append(')');
            traceToGenPar(n,leftPar,rightPar+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
