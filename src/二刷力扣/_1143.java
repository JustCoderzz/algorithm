package ��ˢ����;

import java.util.Scanner;

/**
 * @author lusir
 * @date 2022/3/4 - 15:33
 **/
public class _1143 {
    public  int longestCommonSunSequence(String text1,String text2){
        //dp[i][j]���������i��β j��β�������������
        int [][] dp=new int[text1.length()+1][text2.length()+1];
        for(int i=1;i<=text1.length();i++){
            for(int j=1;j<=text2.length();j++){
                if(text1.charAt(i)==text2.charAt(j)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }


}
