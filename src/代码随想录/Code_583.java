package ��������¼;

/**
 * @author lusir
 * @date 2021/12/11 - 10:13
 **/
public class Code_583 {
    public int minDistance(String word1, String word2) {
//        dp[i][j]���������i-1��β��,j-1��β���ַ����������������
//        ʹ������������������
        int dp[][]=new int[word1.length()+1][word2.length()+1];
        for(int i=1;i<=word1.length();i++){
            char c1=word1.charAt(i-1);
            for(int j=1;j<=word2.length();j++){
                char c2=word2.charAt(j-1);
                if(c1==c2){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return word1.length()+word2.length()-2*dp[word1.length()][word2.length()];
//
//        dp[i][j]���������i-1��β ��j-1��β�Ĵ� Ҫ�������ɾ���ַ��Ĵ���
//        int[][] dp = new int[word1.length() + 1][word2.length() + 1];
//        for (int i = 0; i < word1.length() + 1; i++) dp[i][0] = i;
//        for (int j = 0; j < word2.length() + 1; j++) dp[0][j] = j;
//
//        for (int i = 1; i < word1.length() + 1; i++) {
//            for (int j = 1; j < word2.length() + 1; j++) {
//                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
//                    dp[i][j] = dp[i - 1][j - 1];
//                }else{
//                        ѡ��Ҫɾ����һ���ַ�
//                    dp[i][j] = Math.min(dp[i - 1][j - 1] + 2,
//                                        Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1));
//                }
//            }
//        }
//
//        return dp[word1.length()][word2.length()];
    }
}
