package 二刷力扣;

import java.util.Arrays;

/**
 * @author lusir
 * @date 2022/3/4 - 14:47
 **/
public class _300 {
    public  int  lengthOfLIS(int nums[]){
        //dp[i]代表的是以i下标结尾的最长递增子序列
        int dp[]=new int[nums.length];
        Arrays.fill(dp,1);
        int res=1;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            res=Math.max(dp[i],res);
        }
        return res;
    }
}
