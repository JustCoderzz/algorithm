package ½£Ö¸offerÍ»»÷°æ;

/**
 * @author lusir
 * @date 2022/4/2 - 13:45
 **/
public class _102 {
    public int findTargetSumWays(int[] nums, int target) {

        int sum=0;
        for (int num:nums) {
            sum+=num;
        }
        int left=(sum+target);
        if (left%2==0) {
            left=(sum+target)/2;
        }else return 0;
        int []dp=new int[left+1];
        dp[0]=1;
        for (int j=0;j<nums.length;j++) {
            for (int i=left+1;i>=nums[j];i--) {
                dp[i]+=dp[i-nums[j]];
            }
        }
        return dp[left];

    }
}
