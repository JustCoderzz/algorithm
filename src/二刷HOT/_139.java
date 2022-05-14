package ¶þË¢HOT;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author lusir
 * @date 2022/5/13 - 21:03
 **/
public class _139 {

    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp=new boolean[s.length()+1];
        Set<String> set=new HashSet<>(wordDict);
        dp[0]=true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (set.contains(s.substring(j,i))&&dp[j]) dp[i]=true;
            }
        }
        return dp[s.length()];
    }


}
