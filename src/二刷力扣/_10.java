package 二刷力扣;

/**
 * @author lusir
 * @date 2022/4/14 - 18:16
 **/
public class _10 {
//    正则表达式匹配
    public  boolean isMatch(String s,String p) {
//        前i个s字串  前j个p字串 是否能够匹配
        boolean dp[][] =new boolean[s.length()+1][p.length()+1];
        dp[0][0]=true;
        for (int i = 1; i <= p.length(); i++) {
            if (p.charAt(i-1)=='*') dp[0][i]=dp[0][i-2];
        }
        for (int i = 1; i <=s.length() ; i++) {
            for (int j = 1; j <= p.length(); j++) {

                if (s.charAt(i-1)==p.charAt(j-1)||p.charAt(j-1)=='.') dp[i][j]=dp[i-1][j-1];
                else if (s.charAt(j-1)=='*') {

                    if (s.charAt(i-1)==p.charAt(j-2)||p.charAt(j-2)=='.') {
                        dp[i][j]=dp[i][j-2]||dp[i][j-1]||dp[i-1][j];
                    }else{
                        dp[i][j]=dp[i][j-2];
                    }
                }
            }
        }
        return dp[s.length()][p.length()];

    }
}
