package ��ָOFFER;

/**
 * @author lusir
 * @date 2021/11/15 - 9:15
 **/
public class offer_47 {
    public int maxValue(int[][] grid) {
//        dp�������ÿһ��λ��������õ�����ļ�ֵ���
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
//        �������е�����
//        int row = grid.length;
//        int column = grid[0].length;
//        //dp[i][j]��ʾ��grid[0][0]��grid[i - 1][j - 1]ʱ������ֵ
//        int[][] dp = new int[row + 1][column + 1];
//        for (int i = 1; i <= row; i++) {
//            for (int j = 1; j <= column; j++) {
//                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + grid[i - 1][j - 1];
//            }
//        }
//        return dp[row][column];
    }
}
