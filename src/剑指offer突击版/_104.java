package 剑指offer突击版;

/**
 * @author lusir
 * @date 2022/4/2 - 12:45
 **/
public class _104 {
    public int combinationSum4(int[] nums, int target) {
//        dp[i]代表的是何为i的排列数有多少种
        int []dp=new int[target+1];
        dp[0]=1;
        for (int i=1;i<=target;i++) {
            for (int j=0;j<nums.length;j++) {
                if (i-nums[j]>=0) {
                    dp[i]+=dp[i-nums[j]];
                }
            }
        }
        return dp[target];
    }
}
