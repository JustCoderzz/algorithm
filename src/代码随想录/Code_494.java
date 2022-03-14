package 代码随想录;

/**
 * @author lusir
 * @date 2021/12/4 - 13:10
 **/
public class Code_494 {
    public int findTargetSumWays(int[] nums, int target) {
//        dp[i]代表的是装满i容量的方法有多少重
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        if((sum+target)%2!=0) return 0;
        int size=(sum+target)/2;
        if(size<0) size=-size;
        int []dp=new int[size+1];
        dp[0]=1;
        for(int i=0;i<nums.length;i++){
                for(int j=size;j>=nums[i];j--){
                    dp[j]+=dp[j-nums[i]];
                }
        }
        return dp[size];

    }
}
