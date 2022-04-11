package Leetcode刷题;

/**
 * @author lusir
 * @date 2022/4/11 - 0:05
 **/
public class _357 {
    public int countNumbersWithUniqueDigits(int n) {

        int length = n;
//        求第一位为1-9时的次数
        long sum = 0;
        sum+=getN(length);
//        求第一位为0的情况
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
