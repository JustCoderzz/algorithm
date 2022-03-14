package 代码随想录;

/**
 * @author lusir
 * @date 2021/12/3 - 13:59
 **/
public class Code_416 {
    public boolean canPartition(int[] nums) {
        if(nums.length==0) return false;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }

        if((sum&1)==1) return false;
        int target=sum/2;
        int n=nums.length;
//        dp[j]代表的是容量为j的子集和最大值
        int []dp=new int [target+1];
        for(int i=0;i<n;i++){
            for(int j=target;j>=nums[i];j--){
                dp[j]=Math.max(dp[j],dp[j-nums[i]]+nums[i]);
            }
        }
        return dp[target]==target;
    }
}
