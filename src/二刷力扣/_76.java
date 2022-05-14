package ��ˢ����;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2022/5/3 - 21:01
 **/
public class _76 {

    public String minWindow(String s,String t) {
//        ����������ϣ�����洢s��t����ÿ���ַ�������
        Map<Character,Integer> t_table=new HashMap<>();
        Map<Character,Integer> s_table=new HashMap<>();
//        �����ַ���t  �ҵ�ÿ���ַ��ĸ���
        for (int i = 0; i < t.length(); i++) {
            t_table.put(t.charAt(i),t_table.getOrDefault(t.charAt(i),0)+1);
        }
//        ����һ�����ҵ����ַ�����
        int count=0;
//        ��������ִ�
        int len=Integer.MAX_VALUE;
        String str="";
//        �����ַ���s
        int i=0;
        for (int j = 0; j < s.length(); j++) {
//            ���۸��ַ��Ƿ������t_table�� ���Ƕ��������뵽s_table��
            s_table.put(s.charAt(j),s_table.getOrDefault(s.charAt(j),0)+1);
//            ���t�ַ������и��ַ������ж���s_table���Ƿ�����С��  ��С�� ��count++
            if (t_table.containsKey(s.charAt(j))&&s_table.get(s.charAt(j))<=t_table.get(s.charAt(j))) count++;
//            ������С����  ��ֹ����Ҫ���ַ��������ǵĴ�����
            while (i<j&&(!t_table.containsKey(s.charAt(i))||s_table.get(s.charAt(i))>t_table.get(s.charAt(i)))){
                s_table.put(s.charAt(i),s_table.get(s.charAt(i))-1);
                i++;
            }
            if (count==t.length()&&j-i+1<len) {
                len=j-i+1;
                str=s.substring(i,j+1);
            }
        }
        return str;
    }
}
