package 剑指OFFER;

import java.util.*;

/**
 * @author lusir
 * @date 2021/11/9 - 13:44
 **/
public class offer_48 {
//  抄的答案
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> dic = new HashMap<>();
        int i = -1, res = 0;
        for(int j = 0; j < s.length(); j++) {
            if(dic.containsKey(s.charAt(j)))
                i = Math.max(i, dic.get(s.charAt(j))); // 更新左指针 i
            dic.put(s.charAt(j), j); // 哈希表记录
            res = Math.max(res, j - i); // 更新结果
        }
        return res;
    }






//    public int lengthOfLongestSubstring(String s) {
//
//        int left=0;
//
//        int right=0;
//
//        LinkedList<Character> list=new LinkedList<>();
//
//
//        while (right<s.length()-1){
//            list.add(s.charAt(right));
//
//            if (s.charAt(right+1)!=s.charAt(left)&&!list.contains(s.charAt(right+1))&&(s.charAt(left)!=s.charAt(right)||left==right)){
//
//                right++;
//            }else {
//                left++;
//                right++;
//                list.removeFirst();
//
//            }
//        }
//        return right-left+1;
//    }
}
