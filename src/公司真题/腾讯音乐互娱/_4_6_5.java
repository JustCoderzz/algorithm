package ��˾����.��Ѷ���ֻ���;

/**
 * @author lusir
 * @date 2022/4/6 - 20:09
 **/
public class _4_6_5 {
    public String maxLexicographical (String num) {

        char[] str = num.toCharArray();
        // �ҵ���һ��0
        int idx = 0;
        while(idx < str.length && str[idx] != '0') idx++;
        // �Ѵ����0��ʼ������0ȫ����Ϊ1
        while(idx < str.length && str[idx] == '0') str[idx++] = '1';
        return new String(str);
    }
}
