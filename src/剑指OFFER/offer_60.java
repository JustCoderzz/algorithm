package ��ָOFFER;

import java.util.Arrays;

/**
 * @author lusir
 * @date 2021/11/16 - 19:44
 **/
public class offer_60 {
    public double[] dicesProbability(int n) {
//    f(n,x)�������n�����ӵĺ�Ϊx
        // f(n,x)����f(n-1,x-1)+f(n-2,x-2)+f(1,
        double []dp=new double[6];
        Arrays.fill(dp,1/6.0);
        for(int i=2;i<=n;i++){//��������
            double[] tmp=new double[5*i+1];
            for(int j=0;j<dp.length;j++){//�Ѿ����Ƶõ��ĺ� x-6֮ǰ�ĸ���
                for(int k=0;k<6;k++){//����x-6  ��x�ĸ���
                    tmp[j+k]+=dp[j]/6.0;
                }
            }
            dp=tmp;
        }
        return dp;


    }
}
