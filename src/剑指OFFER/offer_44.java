package ��ָOFFER;

/**
 * @author lusir
 * @date 2021/11/16 - 20:01
 **/
public class offer_44 {
    public int findNthDigit(int n) {
//        ����Ĥ��K���һ��
        int digit=1;//λ�� 1,2,3,4
        long start=1;//��ʼ����  1,10,100
        long count=9;//��λ 9 180 2700
//        ����������ֵ�λ��
            while (n > count) { // 1.
            n -= count;
            digit += 1;
            start *= 10;
            count = digit * start * 9;
        }
//        �����λ���ڵ�����
        long num = start + (n - 1) / digit; // 2.
//        �ҳ��Ǹ�����ĵڼ�λ
        return Long.toString(num).charAt((n - 1) % digit) - '0';



    }

}
