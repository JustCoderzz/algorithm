package ��ָOFFER;

/**
 * @author lusir
 * @date 2021/11/15 - 14:22
 **/
public class offer_46 {
    public int translateNum(int num) {
        //�ж� ��iλ�ܷ�͵�i-1λһ����  �����ԵĻ�  dp[i]=dp[i-1]+dp[i-2] ����Ϊ  dp[i]=dp[i-1]
        //dp[i]��������Ե�iΪ���������ַ���ĸ���
        String str=String.valueOf(num);
        int a=1;
        int b=1;
        for(int i=2;i<=str.length();i++){
            String tmp=str.substring(i-2,i);
            int c=tmp.compareTo("10")>=0&&tmp.compareTo("25")>=0?a+b:b;
            a=b;
            b=c;
        }
        return b;
    }
}
