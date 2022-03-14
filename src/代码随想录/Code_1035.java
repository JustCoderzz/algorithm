package 代码随想录;

/**
 * @author lusir
 * @date 2021/12/10 - 12:32
 **/
public class Code_1035 {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int [][]dp=new int[nums1.length+1][nums2.length+1];
//        dp[i][j]代表的是以i坐标j坐标以前的最长公共zixul
        for(int i=1;i<=nums1.length;i++){
            for(int j=1;j<=nums2.length;j++){
                if(nums1[i-1]==nums2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[nums1.length][nums2.length];
    }
}
