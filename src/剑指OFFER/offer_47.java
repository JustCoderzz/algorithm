package 剑指OFFER;

/**
 * @author lusir
 * @date 2021/11/15 - 9:15
 **/
public class offer_47 {
    public int maxValue(int[][] grid) {
//        dp代表的是每一个位置最大能拿到礼物的价值最大
        int [][]dp=new int[grid.length][grid[0].length];
        dp[0][0]=grid[0][0];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(i==0&&j==0) continue;
                if(i==0){
                    dp[i][j]=dp[i][j-1]+grid[i][j];
                }else if(j==0){
                    dp[i][j]=dp[i-1][j]+grid[i][j];
                }else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1])+grid[i][j];
                }

            }
        }
        return dp[grid.length-1][grid[0].length-1];
//        其他大佬的做法
//        int row = grid.length;
//        int column = grid[0].length;
//        //dp[i][j]表示从grid[0][0]到grid[i - 1][j - 1]时的最大价值
//        int[][] dp = new int[row + 1][column + 1];
//        for (int i = 1; i <= row; i++) {
//            for (int j = 1; j <= column; j++) {
//                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + grid[i - 1][j - 1];
//            }
//        }
//        return dp[row][column];
    }
}
