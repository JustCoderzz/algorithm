package Leetcodeˢ��;

/**
 * @author lusir
 * @date 2022/4/13 - 14:13
 **/
public class _10 {
//    ������ʽƥ��
    public  boolean isMatch(String s, String p) {
//        dp[i][j]�������ǰi���ַ����Ƿ��ܹ�ǰj���ַ�����ƥ��
        boolean [][]dp=new boolean[s.length()+1][p.length()+1];
        dp[0][0]=true;
//        sΪ�մ�ʱ  dp[0][j]=dp[0][j-2]
        for (int i = 1; i <=p.length(); i++) {
          if (p.charAt(i-1)=='*') dp[0][i]=dp[0][i-2];
        }
        for (int i = 1; i < s.length()+1; i++) {
            for (int j = 1; j < p.length()+1; j++) {
                if (s.charAt(i-1)==p.charAt(j-1)||p.charAt(j-1)=='.') {
                    dp[i][j]=dp[i-1][j-1];
                }else if (p.charAt(j-1)=='*') {
//                    *ƥ�����
//                    dp[i][j-2] ƥ��0��
//                    dp[i][j-1]  ƥ��1��
//                    dp[i-1][j]  ƥ��n��
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
