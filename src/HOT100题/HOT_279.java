package HOT100��;

/**
 * @author lusir
 * @date 2021/11/29 - 10:04
 **/
public class HOT_279 {
    public int numSquares(int n) {

        int[]fn=new int[n+1];//��Ϊi����ȫƽ���������ٺ�
        for(int i=1;i<=n;i++){
            int min=Integer.MAX_VALUE;
            for(int j=1;j*j<=i;j++){//��ȫƽ�����ֵ�������  ö�����е���ȫƽ�����������е��� Ȼ��ѡ���������������
                min=Math.min(min,fn[i-j*j]);

            }
            fn[i]=min+1;
        }
        return fn[n];

    }
}
