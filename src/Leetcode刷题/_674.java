package Leetcodeˢ��;

import java.util.Arrays;

/**
 * @author lusir
 * @date 2022/3/19 - 22:55
 **/
public class _674 {
    public  int findLengthOfLCIS(int[]nums){
        //dp[i]���������i��β����������������
        int []dp=new int [nums.length];
        Arrays.fill(dp,1);
        int max=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                dp[i]=dp[i-1]+1;
            }
            max=Math.max(max,dp[i]);
        }
        return max;
    }
}
