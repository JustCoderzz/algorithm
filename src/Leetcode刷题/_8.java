package Leetcodeˢ��;

/**
 * @author lusir
 * @date 2022/3/21 - 18:33
 **/
public class _8 {
    public int myAtoi(String s) {
        int len = s.length();
        // str.charAt(i) ������ȥ����±�ĺϷ��ԣ�һ����ת�����ַ�����
        char[] charArray = s.toCharArray();

        // 1��ȥ��ǰ���ո�
        int index = 0;
        while (index < len && charArray[index] == ' ') {
            index++;
        }

        // 2������Ѿ�������ɣ���Լ������� "      "��
        if (index == len) {
            return 0;
        }

        // 3��������ַ����ַ������� 1 ����Ч������¼����
        int sign = 1;
        char firstChar = charArray[index];
        if (firstChar == '+') {
            index++;
        } else if (firstChar == '-') {
            index++;
            sign = -1;
        }

        // 4�����������ֵ������ַ�����ת��
        // ����ʹ�� long ���ͣ�������Ŀ˵��
        int res = 0;
        while (index < len) {
            char currChar = charArray[index];
            // 4.1 ���жϲ��Ϸ������
            if (currChar > '9' || currChar < '0') {
                break;
            }

            // ��Ŀ��˵������ֻ�ܴ洢 32 λ��С���з�����������ˣ���Ҫ��ǰ�У��ϳ��� 10 �Ժ��Ƿ�Խ��
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && (currChar - '0') > Integer.MAX_VALUE % 10)) {
                return Integer.MAX_VALUE;
            }
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && (currChar - '0') > -(Integer.MIN_VALUE % 10))) {
                return Integer.MIN_VALUE;
            }

            // 4.2 �Ϸ�������£��ſ���ת����ÿһ�����ѷ���λ�˽�ȥ
            res = res * 10 + sign * (currChar - '0');
            index++;
        }
        return res;

    }
}
