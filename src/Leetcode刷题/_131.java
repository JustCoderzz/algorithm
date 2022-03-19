package LeetcodeË¢Ìâ;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author lusir
 * @date 2022/3/15 - 0:34
 **/
public class _131 {

    List<List<String>> res=new ArrayList<>();
    List<String> list=new ArrayList<>();
    public List<List<String>> partition(String s) {


        backTrace(s,0);

        return res;
    }

    public  void  backTrace(String s,int index){
        if(index>=s.length()){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                String str=s.substring(index,i+1);
                list.add(str);
                backTrace(s,i+1);
                list.remove(list.size()-1);
            }else continue;

        }
    }

    private boolean isPalindrome(String s, int startIndex, int end) {
        for (int i = startIndex, j = end; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }



}
