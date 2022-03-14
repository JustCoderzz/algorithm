package 代码随想录;

import java.util.List;

/**
 * @author lusir
 * @date 2021/12/7 - 15:22
 **/
public class Code_139 {
    public boolean wordBreak(String s, List<String> wordDict) {
//            dp[i]代表的是字符串长度为i时，若dp[i]为true，表示可以拆分
//              当dp[j]为true  [j,i]在字典中的话，dp[i]为true
        boolean[] dp=new boolean[s.length()+1];
        dp[0]=true;
        for(int i=1;i<=s.length();i++){//遍历背包
            for(int j=0;j<i;j++){
                if(wordDict.contains(s.substring(j,i))&&dp[j]) dp[i]=true;
            }
        }
        return dp[s.length()];
    }
}
