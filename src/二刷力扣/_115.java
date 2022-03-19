package ��ˢ����;

/**
 * @author lusir
 * @date 2022/3/14 - 14:42
 **/
public class _115 {
    public  int numDistinct(String s,String t){
//        dp[i][j]���������i-1��β��s�г����ַ���j-1��β��t����
            int [][]dp=new int[s.length()+1][t.length()+1];
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
