package HOT100题;

/**
 * @author lusir
 * @date 2021/11/28 - 10:30
 **/
public class HOT_96 {
    public int numTrees(int n) {
//        G[i]表示的是长度为i的二叉树子树的个数
//        G[i]等于分别以小于i的根子数的总数和 如以1为根  以2为根
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
