package LeetcodeÀ¢Ã‚;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2022/4/7 - 0:21
 **/
public class _796 {
    public boolean rotateString(String s, String goal) {
        char[] chars1 = s.toCharArray();
        char[] chars2 = goal.toCharArray();
        if (chars1.length!=chars2.length) return false;
        for (int i=0;i<chars1.length;i++) {
            if (chars1[i]==chars2[0]) {
                int j=i;
                int k=0;
                while (k<chars2.length) {
                    if (j==chars1.length) j=0;
                    if (chars1[j]!=chars2[k]){
                        break;
                    }
                    j++;
                    k++;
                }
                if (k==chars2.length) return true;
            }
        }
        return  false;

    }
}
