package 剑指OFFER;

/**
 * @author lusir
 * @date 2021/11/7 - 14:31
 **/
public class offer_64 {
    public static void main(String[] args) {
        offer_64 res=new offer_64();
        int i = res.sumNums(3);
        System.out.println(i);
    }
    public int sumNums(int n) {
//        if(n==1){
//            return 1;
//        }

//        利用&来短路 代替if
        boolean flag = n > 0 && (n += sumNums(n - 1)) > 0;
        return n;
    }
}
