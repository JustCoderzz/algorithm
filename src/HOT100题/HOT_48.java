package HOT100Ã‚;

/**
 * @author lusir
 * @date 2022/2/26 - 23:09
 **/
public class HOT_48 {
    public void rotate(int[][] matrix) {
        // i=0 j=0     i=0 j=3
        // i=0 j=1     i=1 j=3
        // i=0 j=2     i=2 j=3
        // i=1 j=3     i=3 j=2
        // i=2  j=3    i=3  j=1
        int n = matrix.length;
        for (int i = 0; i < n / 2; ++i) {
            for (int j = 0; j < (n + 1) / 2; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = temp;
            }
        }

    }


}
