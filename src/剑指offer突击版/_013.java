package 剑指offer突击版;

/**
 * @author lusir
 * @date 2022/3/30 - 10:09
 **/
public class _013 {
    class NumMatrix {
        int [][]matrix;
        int [][] nums;

        public NumMatrix(int[][] matrix) {
            this.matrix=matrix;
            this.nums=new int[matrix.length+1][matrix[0].length+1];
            init();
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            int sum=0;
            for (int i=row1+1;i<=row2+1;i++) {
                sum+=nums[i][col2+1]-nums[i][col1];
            }
            return sum;
        }
        public void init() {
//            矩阵i j前的数字和
            int sum=0;
            for (int i=1;i<nums.length;i++) {
                for (int j=0;j<nums[0].length;j++) {
                    if (j!=0) sum+=matrix[i-1][j-1];
                    nums[i][j]=sum;
                }
            }
        }
    }
}
