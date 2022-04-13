package Leetcode刷题;

/**
 * @author lusir
 * @date 2022/4/13 - 14:13
 **/
public class _10 {
//    正则表达式匹配
    public  boolean isMatch(String s, String p) {
//        dp[i][j]代表的是前i个字符串是否能够前j个字符串相匹配
        boolean [][]dp=new boolean[s.length()+1][p.length()+1];
        dp[0][0]=true;
//        s为空串时  dp[0][j]=dp[0][j-2]
        for (int i = 1; i <=p.length(); i++) {
          if (p.charAt(i-1)=='*') dp[0][i]=dp[0][i-2];
        }
        for (int i = 1; i < s.length()+1; i++) {
            for (int j = 1; j < p.length()+1; j++) {
                if (s.charAt(i-1)==p.charAt(j-1)||p.charAt(j-1)=='.') {
                    dp[i][j]=dp[i-1][j-1];
                }else if (p.charAt(j-1)=='*') {
//                    *匹配次数
//                    dp[i][j-2] 匹配0次
//                    dp[i][j-1]  匹配1次
//                    dp[i-1][j]  匹配n次
                    if (s.charAt(i-1)==p.charAt(j-2)||p.charAt(j-2)=='.') {
                        dp[i][j]=dp[i][j-2]||dp[i][j-1]||dp[i-1][j];
                    }else {
                        dp[i][j]=dp[i][j-2];
                    }
                }
            }
        }
        return dp[s.length()][p.length()];
    }
}
