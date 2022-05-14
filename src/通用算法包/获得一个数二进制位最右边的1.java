package 通用算法包;

/**
 * @author lusir
 * @date 2022/5/5 - 16:11
 **/
public class 获得一个数二进制位最右边的1 {
    public static void main(String[] args) {
        int num=121321;//you want
        int res=num&(~num+1);//相当于源码与上补码就可以得到最右边的1
    }
}
