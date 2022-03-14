package 代码随想录;

/**
 * @author lusir
 * @date 2021/12/10 - 13:06
 **/
public class Code_392 {
    public boolean isSubsequence(String s, String t) {
//        dp[i][j]代表的是i,j坐标前，相同子序列长度
        int[][]dp=new int[s.length()+1][t.length()+1];
        for(int i=1;i<=s.length();i++){
            for(int j=1;j<=t.length();j++){
                if(s.charAt(i-1)==t.charAt(j-1)) dp[i][j]=dp[i-1][j-1]+1;
                else dp[i][j]=dp[i][j-1];
            }
        }
        return dp[s.length()][t.length()]==s.length();
    }
}
