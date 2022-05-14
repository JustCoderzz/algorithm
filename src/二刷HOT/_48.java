package ¶þË¢HOT;

/**
 * @author lusir
 * @date 2022/5/11 - 21:06
 **/
public class _48 {
    public void rotate(int[][] matrix) {
        /**
         * 1 2  0 1
         *  2 1    1 2
         *   1 0   0 1
         *       1 2   0 1
         */
        int N=matrix.length;
        for (int i = 0; i < N / 2; i++) {
            for (int j = 0; j < (N+1)/2; j++) {
                int tmp=matrix[i][j];
                matrix[i][j]=matrix[N-j-1][i];
                matrix[N-j-1][i]=matrix[N-i-1][N-j-1];
                matrix[N-i-1][N-j-1]=matrix[j][N-i-1];
                matrix[j][N-i-1]=tmp;
            }
        }
    }
}
