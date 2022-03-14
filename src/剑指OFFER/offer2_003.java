package ��ָOFFER;

/**
 * @author lusir
 * @date 2021/11/9 - 16:37
 **/
public class offer2_003 {
    public int[] countBits(int n) {
        int[] res=new int[n+1];
        for(int i=0;i<n+1;i++){
            res[i]=calc(i);
        }

        return res;
    }

    public  int  calc(int number){
        int count=0;
        while(number!=0){
            count+=number&1;
            number=number>>1;
        }
        return count;
    }

//    �ٷ�ţ������
//    public int[] countBits(int n) {
//        int[] bits = new int[n + 1];
//        for (int i = 0; i <= n; i++) {
//            bits[i] = countOnes(i);
//        }
//        return bits;
//    }
//
//    public int countOnes(int x) {
//        int ones = 0;
//        while (x > 0) {
//            x &= (x - 1);//ͨ�������������Ϳ�֪���ж��ٸ�һ
//            ones++;
//        }
//        return ones;
//    }
//

}
