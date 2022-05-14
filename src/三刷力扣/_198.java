package ��ˢ����;

/**
 * @author lusir
 * @date 2022/5/6 - 23:42
 **/
public class _198 {

    public int rob(int[] nums) {
//        dp[i]����i�±�ǰС͵�ܹ�͵�����Ǯ
        int n=nums.length;
        if (n<2) return nums[0];
        int[]dp=new int[n+1];
        dp[1]=nums[0];
        dp[2]=Math.max(nums[1],nums[0]);
        for (int i = 3; i <= n; i++) {
            dp[i]=Math.max(dp[i-1],nums[i-1]+dp[i-2]);
        }
        return dp[n];
    }
}
