package LeetcodeÀ¢Ã‚;

import java.util.List;

/**
 * @author lusir
 * @date 2022/3/25 - 0:14
 **/
public class _120 {

//    Integer[][] memo;
//    public int minimumTotal(List<List<Integer>> triangle) {
//        memo = new Integer[triangle.size()][triangle.size()];
//        return  dfs(triangle, 0, 0);
//    }
//
//    private int dfs(List<List<Integer>> triangle, int i, int j) {
//        if (i == triangle.size()) {
//            return 0;
//        }
//        if (memo[i][j] != null) {
//            return memo[i][j];
//        }
//        int left=dfs(triangle,i+1,j);
//        int right=dfs(triangle,i+1,j+1);
//        memo[i][j]=Math.min(left,right)+triangle.get(i).get(j);
//        return memo[i][j] ;
//
//    }
    public  int minimumTotal(List<List<Integer>> triangle){
        int n=triangle.size();
        int [][]dp=new int[n+1][n+1];
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                dp[i][j]=Math.min(dp[i+1][j],dp[i+1][j+1])+triangle.get(i).get(j);
            }
        }
        return  dp[0][0];

    }
}
