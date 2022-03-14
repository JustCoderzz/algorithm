package 代码随想录;

/**
 * @author lusir
 * @date 2021/12/10 - 10:08
 **/
public class Code_1143 {
    public int longestCommonSubsequence(String text1, String text2) {
//        dp[i][j]代表的是以i坐标结尾text1,以j坐标结尾的text2的最长公共子序列
//        递推表达式  if(text1.charAt(i-1)==text2.charAt(j-1)) dp[i][j]=dp[i-1][j-1]+1 否则的话dp[i-1][j-1]
        int [][]dp=new int[text1.length()+1][text2.length()+1];

        for(int i=1;i<=text1.length();i++){
            for(int j=1;j<text2.length();j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }

            }
        }
       return dp[text1.length()][text2.length()];
    }
}
