package ´úÂëËæÏëÂ¼;

import java.util.Arrays;

/**
 * @author lusir
 * @date 2021/12/9 - 13:48
 **/
public class Code_300 {
    public int lengthOfLIS(int[] nums) {
        int []dp=new int[nums.length];
        Arrays.fill(dp,1);
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int res=0;
        for(int i=0;i<dp.length;i++){
            res=Math.max(res,dp[i]);
        }
        return res;
    }
}
