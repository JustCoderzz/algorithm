package _360����;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author lusir
 * @date 2022/3/20 - 10:11
 **/
public class FindComplexPassword {
//��һ������  �ж����ĸ�����   ���� ���ȴ���8  ������ ��д��ĸ   ������Сд��ĸ   �����������ַ�
    public boolean find(String s){
//        ��֤�ַ������Ƿ��������ַ�
        String regEx="[ _`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~��@#��%����&*��������+|{}������������������������]|\n|\r|\t";
        Pattern p=Pattern.compile(regEx);
        Matcher m=p.matcher(s);
        return m.find();
    }
}
