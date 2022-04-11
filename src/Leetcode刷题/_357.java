package Leetcodeˢ��;

/**
 * @author lusir
 * @date 2022/4/11 - 0:05
 **/
public class _357 {
    public int countNumbersWithUniqueDigits(int n) {

        int length = n;
//        ���һλΪ1-9ʱ�Ĵ���
        long sum = 0;
        sum+=getN(length);
//        ���һλΪ0�����
        sum+=getZ(length);
        return (int) sum;
    }

    int getN(int length) {
        int sum=9;
        int count=9;
        for (int i = 0; i < length-1; i++) {
            sum*=count;
            count--;
        }
        return sum;
    }

    int getZ(int length) {
        long sum=0;
        int i=length-1;
        while (i>0){
            sum+=getN(i);
            i--;
        }
        return (int) (sum+1);
    }





}
