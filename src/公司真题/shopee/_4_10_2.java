package ��˾����.shopee;

/**
 * @author lusir
 * @date 2022/4/10 - 22:13
 **/
public class _4_10_2 {
//    �滻�ַ����е����ֳ�"num"�������������,����������һ���滻��"num"��
//
//����ָ0123456789
//
//�磺"abvhjb123ddd" �滻�� "abvhjbnumddd"
//                         abvhjbnumddd
//�磺"abvhjb1y3ddd" �滻�� "abvhjbnumynumddd"
//                         abvhjbnumynumddd
    public String replaceStr (String s) {

        char[] chars = s.toCharArray();
        StringBuilder sb=new StringBuilder();
        int j=0;
        while (j<chars.length) {
            boolean flag=false;
            while (j<chars.length&&Character.isDigit(chars[j])){
                j++;
                flag=true;
            }
            if (flag) sb.append("num");
            if (j<chars.length){
                sb.append(chars[j++]);
            }
        }
        return sb.toString();

    }
}
