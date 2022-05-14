package ÈýË¢Á¦¿Û;

/**
 * @author lusir
 * @date 2022/4/27 - 23:00
 **/
public class _14 {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        int m=strs[0].length();
        for (int i = 0; i < m; i++) {
            char c=strs[0].charAt(i);
            for (int j = 1; j < n; j++) {
               if (strs[j].length()<=i||strs[j].charAt(i)!=c) {
                   return strs[0].substring(0,i);
               }
            }
        }
        return strs[0];
    }
}
