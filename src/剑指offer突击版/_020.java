package ½£Ö¸offerÍ»»÷°æ;

/**
 * @author lusir
 * @date 2022/3/29 - 0:24
 **/
public class _020 {
    public int countSubstrings(String s) {
        int res=0;
        for (int i = 0; i < s.length(); i++) {
            for (int j=i;j<=i+1;j++) {
                int p=i;
                int q=j;
                while (p>=0&&q<s.length()&&s.charAt(p--)==s.charAt(q++)) res++;
            }
        }
        return res;
    }
}
