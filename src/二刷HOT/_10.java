package ��ˢHOT;

/**
 * @author lusir
 * @date 2022/5/9 - 20:21
 **/
public class _10 {
    public boolean isMatch(String s, String p) {
//        Ҫ�ö�̬�滮����  ��Ϊ���ǿ�����������ת���õ����յ�����
//        dp[i][j]���������i��βs����j��β��p�ܷ�ƥ��
//        �����߶�Ӧ���ַ����  �����ֻ��Ҫ��ǰ����Ƿ��ܹ���������
//        �������ַ�����ȣ��򿴸��ַ��ǲ���.�ַ�
//        ��j-2���ַ��Ƿ����  ����ȿ����ַ��ǲ���*���ַ�
//        ����*���ַ�  ���ǾͿ���ֻƥ��һ��  Ҳ���Բ�ƥ��  �ֻ���ƥ����
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[0][0]=true;
        for (int i = 1; i <= p.length(); i++) {
//            ��*��ʱ��ǰ����ַ�������  ��Ϊ�����ܱ�ɿ��ַ�
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
