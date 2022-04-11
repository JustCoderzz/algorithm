package 公司真题.字节跳动;

import java.util.Scanner;

/**
 * @author lusir
 * @date 2022/4/10 - 22:52
 **/
public class GiveChange {
    public static void main(String[] args) {

        Scanner reader=new Scanner(System.in);
        int num=1024-reader.nextInt();
        System.out.println(give(num));
    }

    public  static  int give(int num) {
        int sum=0;
        if (num>=64) {
            sum+=num/64;
            num=num%64;
        }
        if (num>=16) {
            sum+=num/16;
            num%=64;
        }
        if (num>=4) {
            sum+=num/4;
            num%=4;
        }
        sum+=num;
        return sum;
    }
}
