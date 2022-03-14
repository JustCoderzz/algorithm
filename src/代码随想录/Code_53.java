package ��������¼;

/**
 * @author lusir
 * @date 2021/12/10 - 12:37
 **/
public class Code_53 {
    public int maxSubArray(int[] nums) {
//        dp[i]������ǵ�i������ǰ������������
        int dp[]=new int[nums.length+1];
        int res=Integer.MIN_VALUE;
        for(int i=1;i<=nums.length;i++){
            dp[i]=Math.max(dp[i-1]+nums[i-1],nums[i-1]);
            res=Math.max(res,dp[i]);
        }
        return res;
    }
}
