package Leetcodeˢ��;

/**
 * @author lusir
 * @date 2022/3/24 - 14:33
 **/
public class _59 {
    public int[][] generateMatrix(int n) {
        int [][]res=new int[n][n];
        int i=0;
        int j=0;
        int num=1;

        while (num<=n*n){

//            ������
            while (j<n&&res[i][j]==0) {
                res[i][j++]=num;
                num++;
            }
            j--;
            i++;
//            ���ϵ���
            while (i<n&&res[i][j]==0){
                res[i++][j]=num;
                num++;
            }
            j--;
            i--;
//            ���ҵ���
            while (j>=0&&res[i][j]==0){
                res[i][j--]=num;
                num++;
            }
            j++;
            i--;
//            ���µ���
            while (i>=0&&res[i][j]==0){
                res[i--][j]=num;
                num++;
            }
            i++;
            j++;
        }
        return res;
    }
}
