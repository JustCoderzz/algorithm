package HOT100题;

/**
 * @author lusir
 * @date 2021/11/1 - 19:41
 **/
public class HOT_64 {
//    独立完成   动态规划
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int fn[][]=new int[m][n];
        fn[0][0]=grid[0][0];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0&&j==0){
                    continue;
                }
                if(i==0){
                    fn[i][j]=fn[i][j-1]+grid[i][j];
                }else if(j==0){
                    fn[i][j]=fn[i-1][j]+grid[i][j];
                }else {
                    fn[i][j]=Math.min(fn[i-1][j],fn[i][j-1])+grid[i][j];
                }

            }
        }
        return fn[m-1][n-1];
    }
}
