package 剑指offer突击版;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2022/3/29 - 0:38
 **/
public class _005 {
    public int maxProduct(String[] words) {
//        int max=0;
//        for (int i=0;i<words.length;i++) {
//            for (int j=i+1;j<words.length;j++) {
//                boolean flag=false;
//                for (int k=0;k<words[j].length();k++) {
//                    if (words[i].contains(words[j].charAt(k)+"")) {
//                        flag=true;
//                        break;
//                    }
//                }
//                if (flag) continue;
//                max=Math.max(max,words[i].length()*words[j].length());
//            }
//        }
//        return max;
        Map<Integer,Integer> map=new HashMap<>();
        for (String s:words) {
            int bitMask=0;
            int len=s.length();
            for (char c:s.toCharArray()) bitMask|=(1<<('c'-'a'));
            map.put(bitMask,Math.max(map.getOrDefault(bitMask,0),len));
        }
        int ans=0;
        for (int x:map.keySet()) {
            for (int y:map.keySet()) {
                if ((x&y)==0) ans=Math.max(ans,map.get(x)*map.get(y));
            }
        }
        return ans;
//        int n = words.length,idx = 0;
//        int[] masks = new int[n];
//        for(String w: words){
//            int t = 0;
//            for(int i=0;i<w.length();i++){
//                int u = w.charAt(i)-'a';
//                t = t | (1 << u);  将1左移多少位也就是表示该位对应的字母
//            }
//            masks[idx++] = t;
//        }
//        int ans = 0;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<i;j++){
//                if((masks[i] & masks[j])==0){
//                    ans = Math.max(ans, words[i].length()*words[j].length());
//                }
//
//            }
//        }
//        return ans;
    }

    public boolean hasSameChar(String s1,String s2) {
        int bitMask1=0;
        int bitMask2=0;
        for (char c:s1.toCharArray()) bitMask1|=(1<<(c-'a'));
        for (char c: s2.toCharArray()) bitMask2|=(1<<(c-'a'));
        return (bitMask1&bitMask2)==0;
    }

}
