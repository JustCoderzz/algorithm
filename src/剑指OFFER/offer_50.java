package ��ָOFFER;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2021/11/7 - 13:51
 **/
public class offer_50 {
    public char firstUniqChar(String s) {
//        �Լ�д��   ִ��ʱ��28ms
//        LinkedHashMap<Character,Integer> res=new LinkedHashMap<>();
//        for(int i=0;i<s.length();i++){
//            res.put(s.charAt(i),res.getOrDefault(s.charAt(i),0)+1);
//        }
//        for(Map.Entry<Character,Integer> entry:res.entrySet()){
//            if(entry.getValue()==1){
//                return entry.getKey();
//            }
//        }
//        return ' ';

//        ���˵�  ִ��ʱ��7ms
        if (s.equals("")) return ' ';
        //������a'-'z'���ֵ�
        int[] target = new int[26];
        //��һ�α��������ַ�ͳ�Ƶ��ֵ�����
        for (int i = 0; i < s.length(); i++) {
            target[s.charAt(i) - 'a']++;
        }
        //�ڶ��α��������ֵ������ȡ����
        for (int i = 0; i < s.length(); i++) {
            if (target[s.charAt(i) - 'a'] == 1) return s.charAt(i);
        }

        return ' ';
    }
}
