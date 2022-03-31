package ½£Ö¸offerÍ»»÷°æ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lusir
 * @date 2022/3/31 - 12:13
 **/
public class _015 {
    public List<Integer> findAnagrams(String s, String p) {

        char[] cnt1=new char[26];
        char[] cnt2=new char[26];
        int m=s.length();
        int n=p.length();
        List<Integer> res=new ArrayList<>();
        if (p.length()>s.length()) return res;
        for (int i=0;i<n;i++) {
            cnt1[s.charAt(i)-'a']++;
            cnt2[p.charAt(i)-'a']++;
        }
        if (Arrays.equals(cnt1,cnt2)) {
            res.add(0);
        }
        for (int i=n;i<m;i++) {
            cnt1[s.charAt(i-n)-'a']--;
            cnt1[s.charAt(i)-'a']++;
            if (Arrays.equals(cnt1,cnt2)) {
                res.add(i-n+1);
            }
        }
        return res;
    }
}
