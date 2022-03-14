package HOT100题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lusir
 * @date 2022/3/1 - 21:38
 **/
public class Hot_438 {
    //  自己写的   效果不好
//    public List<Integer> findAnagrams(String s, String p) {
//        char [] chars=p.toCharArray();
//        Arrays.sort(chars);
//        String str=new String(chars);
//        int length=str.length();
//        List<Integer> res=new ArrayList<>();
//        for(int i=0;i<s.length();i++){
//            if ((i+length)>s.length()) break;
//            String tmp=s.substring(i,i+length);
//            char [] arr=tmp.toCharArray();
//            Arrays.sort(arr);
//            String a=new String(arr);
//            if(a.equals(str)) res.add(i);
//        }
//        return res;
//    }
    public List<Integer> findAnagrams(String s, String p) {
        int sLen = s.length(), pLen = p.length();

        if (sLen < pLen) {
            return new ArrayList<Integer>();
        }

        List<Integer> ans = new ArrayList<Integer>();
        int[] sCount = new int[26];
        int[] pCount = new int[26];
        for (int i = 0; i < pLen; ++i) {
            ++sCount[s.charAt(i) - 'a'];
            ++pCount[p.charAt(i) - 'a'];
        }

        if (Arrays.equals(sCount, pCount)) {
            ans.add(0);
        }

        for (int i = 0; i < sLen - pLen; ++i) {
            --sCount[s.charAt(i) - 'a'];
            ++sCount[s.charAt(i + pLen) - 'a'];

            if (Arrays.equals(sCount, pCount)) {
                ans.add(i + 1);
            }
        }

        return ans;
    }


}
