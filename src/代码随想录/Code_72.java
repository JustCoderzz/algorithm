package 代码随想录;

/**
 * @author lusir
 * @date 2021/12/11 - 10:50
 **/
public class Code_72 {
    public int minDistance(String word1, String word2) {
//        dp[i][j]代表的是以i-1结尾的字符串word1,以j-1结尾的字符串word2相等的最少编辑距离
        int [][]dp=new int[word1.length()+1][word2.length()+1];
        for(int i=0;i<=word1.length();i++){
            dp[i][0]=i;
        }
        for(int j=0;j<=word2.length();j++){
            dp[0][j]=j;
        }
        for(int i=1;i<=word1.length();i++){
            char c1=word1.charAt(i-1);
            for(int j=1;j<=word2.length();j++){
                char c2=word2.charAt(j-1);
                if(c1==c2){
                    dp[i][j]=dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]))+1;
                }
            }
        }
        return dp[word1.length()][word2.length()];
    }
}
