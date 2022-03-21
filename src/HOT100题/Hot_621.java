package HOT100Ã‚;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2022/2/27 - 23:27
 **/
public class Hot_621 {
    public int leastInterval(char[] tasks, int n) {
        int []chars=new int[26];
        int max=0;
        for(Character c:tasks){
            max=Math.max(max,++chars[c-'A']);
        }
        int res=(max-1)*(n+1);
        for(int i=0;i<26;i++){
            if(chars[i]==max) res++;
        }
        return Math.max(res,tasks.length);

    }
}
