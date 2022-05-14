package ¶þË¢HOT;

/**
 * @author lusir
 * @date 2022/5/9 - 20:11
 **/
public class _5 {
    public String longestPalindrome(String s) {
        String res="";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < i + 2; j++) {
                int L=i;int R=j;
                while (L>=0&&R<s.length()&&s.charAt(L)==s.charAt(R)){
                    L--;
                    R++;
                }
                if (R-L-1>res.length()){
                    res=s.substring(L+1,R);
                }
            }
        }
        return res;
    }
}
