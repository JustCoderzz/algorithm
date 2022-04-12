package LeetcodeË¢Ìâ;

/**
 * @author lusir
 * @date 2022/4/12 - 13:11
 **/
public class _806 {
    public int[] numberOfLines(int[] widths, String s) {

        int l=1;
        int w=0;
        int limitWidth=100;
        for (char c:s.toCharArray()) {
            w+=widths[c-'a'];
            if (w>limitWidth) {
                l++;
                w=widths[c-'a'];
            }
        }
        return new int[]{l,w};
    }
}
