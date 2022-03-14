package ��������¼;

/**
 * @author lusir
 * @date 2021/12/10 - 9:22
 **/
public class Code_674 {
    public int findLengthOfLCIS(int[] nums) {
        int []dp=new int[nums.length];
//        dp[i]��ʾ����i����ǰ�������������г���
        if(nums.length==1) return 1;
        int res=0;
        for(int i=1;i<nums.length;i++){
            dp[i]=nums[i]>nums[i-1]?dp[i-1]+1:0;
            res=Math.max(res,dp[i]);
        }
        return res+1;
    }
}
