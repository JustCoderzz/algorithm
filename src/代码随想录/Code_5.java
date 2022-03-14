package ��������¼;

/**
 * @author lusir
 * @date 2021/12/12 - 14:29
 **/
public class Code_5 {
    public String longestPalindrome(String s) {

//        dp[i][j]��������ַ�����i��j�Ƿ�Ϊ�����ַ���
        boolean[][]dp=new boolean[s.length()][s.length()];
        int max=0;
        String maxStr=null;
        for(int i=s.length()-1;i>=0;i++){
            for(int j=i;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    if(j-i<=1||dp[i+1][j-1]) {
                        dp[i][j] = true;
                        maxStr = j - i + 1 > max ? s.substring(i, j + 1) : maxStr;
                        max = maxStr.length();
                    }
                }
            }
        }
        return maxStr;


    }
}
