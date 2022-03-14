package HOT100��;

/**
 * @author lusir
 * @date 2021/11/28 - 10:30
 **/
public class HOT_96 {
    public int numTrees(int n) {
//        G[i]��ʾ���ǳ���Ϊi�Ķ����������ĸ���
//        G[i]���ڷֱ���С��i�ĸ������������� ����1Ϊ��  ��2Ϊ��
        int []G=new int[n+1];
        G[0]=1;
        G[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++){
                G[i]+=G[j-1]*G[i-j];
            }
        }
        return G[n];
    }
}
