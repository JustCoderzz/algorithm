package 剑指OFFER;

import java.util.*;

/**
 * @author lusir
 * @date 2021/11/6 - 9:51
 **/
public class offer_38 {


    public String[] permutation(String s) {
        Set<String> res=new HashSet<>();

        StringBuilder stringBuilder=new StringBuilder();
        boolean[] visited=new boolean[s.length()];

        backtrack(res,stringBuilder,s,visited);

        return res.toArray(new String[res.size()]);
    }

    public void backtrack(Set<String> res,StringBuilder stringBuilder,String s,boolean[] visited){
        if(stringBuilder.length()==s.length()){

                res.add(stringBuilder.toString());
                return;


        }
        for(int i=0;i<s.length();i++){
            if (visited[i]) continue;
            stringBuilder.append(s.charAt(i));
            visited[i]=true;
            backtrack(res,stringBuilder,s,visited);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
            visited[i]=false;

        }
    }

//    答案是对的  会超时 把list换成Set就行
//    public String[] permutation(String s) {
//        List<String> res=new ArrayList<>();   Set<String> res=new HashSet<>();
//
//        StringBuilder stringBuilder=new StringBuilder(s);
//
//        backtrack(res,stringBuilder,s,0);
//
//        return res.toArray(new String[res.size()]);
//    }
//
//    public void backtrack(List<String> res,StringBuilder stringBuilder,String s,int startIndex){
//        if(startIndex==s.length()){
//            if(!res.contains(stringBuilder.toString())){
//                res.add(stringBuilder.toString());
//                return;
//            }
//
//        }
//        for(int i=startIndex;i<s.length();i++){
//            char a=stringBuilder.charAt(startIndex);
//            char b=stringBuilder.charAt(i);
//            stringBuilder.setCharAt(startIndex,b);
//            stringBuilder.setCharAt(i,a);
//            backtrack(res,stringBuilder,s,startIndex+1);
//            stringBuilder.setCharAt(startIndex,a);
//            stringBuilder.setCharAt(i,b);
//        }
//    }
}
