package 代码随想录;

/**
 * @author lusir
 * @date 2021/12/10 - 9:43
 **/
public class Code_718 {
    public int findLength(int[] nums1, int[] nums2) {
//        dp[i][j]代表的是以nums1以下标i-1结尾,nums2以下标j-1结尾的最长重复子数组
        int [][]dp=new int[nums1.length+1][nums2.length+1];
        int res=0;
        for(int i=1;i<=nums1.length;i++){
            for(int j=1;j<=nums2.length;j++){
                if(nums1[i-1]==nums2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                    res=Math.max(res,dp[i][j]);
                }
            }
        }
        return res;
    }
}
