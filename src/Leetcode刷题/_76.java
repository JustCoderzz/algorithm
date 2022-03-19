package Leetcode刷题;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2022/3/11 - 15:33
 **/
public class _76 {
    public String minWindow(String s, String t) {

        Map<Character,Integer>  hs=new HashMap<>();
        Map<Character,Integer> ht=new HashMap<>();
        int len=Integer.MAX_VALUE;
        for(int i=0;i<t.length();i++){
            ht.put(t.charAt(i),ht.getOrDefault(t.charAt(i),0)+1);
        }
        int count=0;
        String res="";
        int first=0;
        for(int i=0;i<s.length();i++){
            if(ht.containsKey(s.charAt(i))){
                first=i;
                break;
            }
        }
        for(int i=first,j=first;j<s.length();j++){
//            遍历到该字符  放到表中   将其值+1
            hs.put(s.charAt(j),hs.getOrDefault(s.charAt(j),0)+1);
//            该值是否在t字符中  该值对应的次数比较  若s<=t 因为是先添加了  就让count++
            if(ht.containsKey(s.charAt(j))&&hs.get(s.charAt(j))<=ht.get(s.charAt(j))) count++;
//            调整窗口大小  从前往后缩小窗口
            while(i<j&&(!ht.containsKey(s.charAt(i))||hs.get(s.charAt(i))>ht.get(s.charAt(i)))){
                Character tmp=s.charAt(i);
                hs.put(tmp,hs.get(tmp)-1);
                i++;
            }
//              当count==t.size时 就是满足要求 时  更新len
            if(count==t.length()&&j-i+1<len){
                len=j-i+1;
                res=s.substring(i,j+1);
            }
        }
        return res;



    }
}
