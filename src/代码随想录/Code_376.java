package 代码随想录;

/**
 * @author lusir
 * @date 2021/12/13 - 9:40
 **/
public class Code_376 {
    public int wiggleMaxLength(int[] nums) {
//  dp[i][j]代表的是下标i到下标j摆动序列的最长子序列长度
        int[][]dp=new int[nums.length][nums.length];

        for(int i=1;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                if(j-i<=1){
                    dp[i][j]=j-i+1;
                }else {
                    dp[i][j]=Math.max(dp[i-1][j],Math.max(dp[i][j-1],dp[i-1][j-1]));
                }
            }
        }
        return dp[nums.length-1][nums.length-1];
    }
}
