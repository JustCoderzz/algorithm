package ÈýË¢Á¦¿Û;

/**
 * @author lusir
 * @date 2022/4/27 - 22:29
 **/
public class _738 {
    public int monotoneIncreasingDigits(int n) {
        String s=n+"";
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length-1; i++) {
            if (chars[i]-'0'>chars[i+1]-'0') {
                while (i>=1&&chars[i-1]-'0'==chars[i]-'0'){
                    i--;
                }
                chars[i]--;
                for (int j = i+1; j < chars.length; j++) {
                    chars[j]='9';
                }
                break;
            }
        }
        return Integer.parseInt(new String(chars));
    }
}
