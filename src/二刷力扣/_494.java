package 二刷力扣;

/**
 * @author lusir
 * @date 2022/3/18 - 20:24
 **/
public class _494 {
    public int findTargetSumWays(int[] nums, int target) {
        //    left -  right=target
//            left +  target=  sum
//            2*left=target+sum
//        left=target+sum   /2   只要找到合为left的方法就行
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        if((sum+target)%2!=0) return 0;
        int size=(sum+target)/2;
        if(size<0) size=-size;
        int[] []dp=new int[nums.length+1][size+1];
        dp[0]=1;
        for(int i=0;i<=size;i++){
            for(int j=0;j<nums.length&&i>nums[j];j++){
                dp[i]+=dp[i-nums[j]];
            }
        }
        return dp[size];
    }
}
