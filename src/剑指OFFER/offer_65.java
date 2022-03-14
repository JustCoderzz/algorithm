package 剑指OFFER;

/**
 * @author lusir
 * @date 2021/11/19 - 12:30
 **/
public class offer_65 {
    public int add(int a, int b) {
        while(b!=0){
            int c=(a&b)<<1;//得到进位
            a^=b;//相加
            b=c;//得到的结果在下一次循环中与进位相加
        }
        return a;
    }
}
