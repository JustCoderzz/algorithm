package Leetcode刷题;

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

//            从左到右
            while (j<n&&res[i][j]==0) {
                res[i][j++]=num;
                num++;
            }
            j--;
            i++;
//            从上到下
            while (i<n&&res[i][j]==0){
                res[i++][j]=num;
                num++;
            }
            j--;
            i--;
//            从右到左
            while (j>=0&&res[i][j]==0){
                res[i][j--]=num;
                num++;
            }
            j++;
            i--;
//            从下到上
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
