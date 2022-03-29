package 分享的题目;

/**
 * @author lusir
 * @date 2022/3/28 - 23:44
 **/
public class CompleteBinaryTreeBuild {

    public int[] solution (int n) {
        int res[]=new int[n];
        int index=0;
        if (n%2==0) {
            index=n/2;
        }else {
            index=(n-1)/2;
        }
        int i=index;
        int j=i+1;
        int EvenNum=2;
        int OddNum=1;
        while (i>=1&&EvenNum<=n) {
            res[i-1]=EvenNum;
            EvenNum+=2;
            i--;
        }
        while (j<=n&&OddNum<=n) {
            res[j-1]=OddNum;
            OddNum+=2;
            j++;
        }
        return res;
    }
}
