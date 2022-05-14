package 二刷HOT;

/**
 * @author lusir
 * @date 2022/5/9 - 20:21
 **/
public class _10 {
    public boolean isMatch(String s, String p) {
//        要用动态规划来解  因为我们可以由子问题转化得到最终的问题
//        dp[i][j]代表的是以i结尾s，以j结尾的p能否匹配
//        若两者对应的字符相等  则代表只需要看前面的是否能够正常比配
//        若两者字符不相等，则看该字符是不是.字符
//        看j-2的字符是否相等  若相等看该字符是不是*号字符
//        若是*号字符  我们就可以只匹配一个  也可以不匹配  又或者匹配多个
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[0][0]=true;
        for (int i = 1; i <= p.length(); i++) {
//            有*号时把前面的字符给消掉  因为尽可能变成空字符
            if (p.charAt(i-1)=='*') dp[0][i]=dp[0][i-2];
        }
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= p.length(); j++) {
                if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (p.charAt(j - 1) == '*') {
                    if(s.charAt(i-1)==p.charAt(j-2)||p.charAt(j-2)=='.'){
                        dp[i][j]=dp[i][j-1]||dp[i][j-2]||dp[i-1][j];
                    }else{
                        dp[i][j] =dp[i][j - 2];
                    }

                }
            }
        }
        return dp[s.length()][p.length()];
    }
}
