package ��ָOFFER;

/**
 * @author lusir
 * @date 2021/11/19 - 12:30
 **/
public class offer_65 {
    public int add(int a, int b) {
        while(b!=0){
            int c=(a&b)<<1;//�õ���λ
            a^=b;//���
            b=c;//�õ��Ľ������һ��ѭ�������λ���
        }
        return a;
    }
}
