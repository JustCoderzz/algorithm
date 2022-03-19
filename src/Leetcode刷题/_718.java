package LeetcodeË¢Ìâ;

/**
 * @author lusir
 * @date 2022/3/19 - 23:04
 **/
public class _718 {
    public  int findLength(int[] nums1,int []nums2){

        int[][]dp=new int[nums1.length+1][nums2.length+1];
        int max=0;
        for(int i=1;i<nums1.length;i++){
            for(int j=1;j<nums2.length;j++){
                if(nums1[i-1]==nums2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                max=Math.max(max,dp[i][j]);
            }
        }
        return  max;
    }
}
