package ´úÂëËæÏëÂ¼;

import java.util.Arrays;

/**
 * @author lusir
 * @date 2021/12/13 - 9:21
 **/
public class Code_455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        int sum=0;
        while (i<g.length&&j<s.length){
            if(s[j]>=g[i]){
                sum++;
                i++;
                j++;
            }else {
                j++;
            }
        }
        return sum;
    }
}
