package ��������¼;

import java.util.List;

/**
 * @author lusir
 * @date 2021/12/7 - 15:22
 **/
public class Code_139 {
    public boolean wordBreak(String s, List<String> wordDict) {
//            dp[i]��������ַ�������Ϊiʱ����dp[i]Ϊtrue����ʾ���Բ��
//              ��dp[j]Ϊtrue  [j,i]���ֵ��еĻ���dp[i]Ϊtrue
        boolean[] dp=new boolean[s.length()+1];
        dp[0]=true;
        for(int i=1;i<=s.length();i++){//��������
            for(int j=0;j<i;j++){
                if(wordDict.contains(s.substring(j,i))&&dp[j]) dp[i]=true;
            }
        }
        return dp[s.length()];
    }
}
