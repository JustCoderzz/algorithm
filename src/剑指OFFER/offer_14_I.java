package ��ָOFFER;

/**
 * @author lusir
 * @date 2021/11/15 - 9:29
 **/
public class offer_14_I {
    public int cuttingRope(int n) {
//        ����Ϊn�����ӵ����˻���dp[n]
        int []dp=new int[n+1];

        for(int i=2;i<=n;i++){
            for(int j=1;j<=i/2;j++){//ֻ���ж�һ����У��൱�ڴ���߼����ұ߼�������
//                ���ĳ���Ϊj-i������ѡ���һ�Σ�Ҳ�Ͷ�Ӧj*(j-i)����֮����j*dp[i-j]�����ŷ�ʽ����������󲻶���õ���dp[i]���Ƚϵõ�����dp
                dp[i]=Math.max(Math.max(j*(i-j),j*dp[i-j]),dp[i]);
            }
        }
        return dp[n];
//        �ٷ�ţ�ƽⷨ
//    if(n <= 3) return n - 1;
//        int a = n / 3, b = n % 3;
//        if(b == 0) return (int)Math.pow(3, a);
//        if(b == 1) return (int)Math.pow(3, a - 1) * 4;
//        return (int)Math.pow(3, a) * 2;
//
//
    }
}
