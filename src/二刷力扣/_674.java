package 二刷力扣;

import java.util.Arrays;

/**
 * @author lusir
 * @date 2022/3/4 - 15:00
 **/
public class _674 {
    public  int findLengthOfLCIS(int nums[]){
        //dp[i]代表的是以下标i结尾的数组的最长连续递增子序列
        int[]dp=new int[nums.length];
        if(nums.length==1) return 1;
        Arrays.fill(dp,1);
        int res=1;
        for(int i=1;i<nums.length;i++){
            if (nums[i]>nums[i-1]) dp[i]=dp[i-1]+1;
            res=Math.max(dp[i],res);
        }
        return res;

    }
}
