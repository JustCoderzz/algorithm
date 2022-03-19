package Leetcodeˢ��;

import java.util.Arrays;

/**
 * @author lusir
 * @date 2022/3/19 - 21:54
 **/
public class _300 {
    public  int lengthOfLIS(int[]nums){
//        dp[i]���������i-1�±��β�������������
        int[]dp=new int[nums.length+1];
        Arrays.fill(dp,1);
        int res=1;
        for(int i=1;i<=nums.length;i++){
            for(int j=1;j<i;j++){
                if(nums[i-1]>nums[j-1]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
                res=Math.max(res,dp[i]);
            }
        }
        return  res;
    }
}
