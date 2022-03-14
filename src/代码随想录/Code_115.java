package 代码随想录;

/**
 * @author lusir
 * @date 2021/12/10 - 13:17
 **/
public class Code_115 {
    public int numDistinct(String s, String t) {
//        dp[i][j]代表的是s以i-1为结尾的子序列，t以j-1结尾子序列的个数
        int[][]dp=new int[s.length()+1][t.length()+1];
        for(int i=0;i<=s.length();i++){
            dp[i][0]=1;
        }
        for(int i=1;i<=s.length();i++){
            for(int j=1;j<=t.length();j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[s.length()][t.length()];
    }
}
