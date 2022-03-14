package 代码随想录;

/**
 * @author lusir
 * @date 2021/12/6 - 12:06
 **/
public class Code_377 {
    public int combinationSum4(int[] nums, int target) {
//        dp[i]代表的是凑成i的排列数
//        完全背包组合数外层遍历物品，内层遍历容量
//        排列数外层遍历容量  内层遍历物品
        int []dp=new int [target+1];
        dp[0]=1;
        for(int i=0;i<=target;i++){
            for(int j=0;j<nums.length;j++){
                if(i>=nums[j]){
                    dp[i]+=dp[i-nums[j]];
                }
            }
        }
        return dp[target];
    }
}
