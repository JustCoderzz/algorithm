package 剑指OFFER;

/**
 * @author lusir
 * @date 2021/11/16 - 20:01
 **/
public class offer_44 {
    public int findNthDigit(int n) {
//        又是膜拜K神的一天
        int digit=1;//位数 1,2,3,4
        long start=1;//初始坐标  1,10,100
        long count=9;//数位 9 180 2700
//        求出所在数字的位数
            while (n > count) { // 1.
            n -= count;
            digit += 1;
            start *= 10;
            count = digit * start * 9;
        }
//        求出数位所在的数字
        long num = start + (n - 1) / digit; // 2.
//        找出是该数组的第几位
        return Long.toString(num).charAt((n - 1) % digit) - '0';



    }

}
