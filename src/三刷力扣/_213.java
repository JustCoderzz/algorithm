package ÈıË¢Á¦¿Û;

/**
 * @author lusir
 * @date 2022/5/6 - 23:52
 **/
public class _213 {

    public int rob(int[] nums) {
        int n=nums.length;
        if (n<2) return nums[0];
        return Math.max(robAct(nums,0,n-2),robAct(nums,1,n-1));
    }

    public int robAct(int[] nums,int left,int right) {
        if (right-left+1<2) return nums[left];
        int x=0;
        int y;
        int z=nums[left];
//        z       x         y
//    dp[i]=    dp[i-1]   dp[i-2]+nums[i]
//    dp[i+1]   dp[i]     dp[i-1]+num[i+1]
        for (int i = left+1; i <= right; i++) {
            y=x;
            x=z;
            z=Math.max(x,y+nums[i]);
        }
        return z;
    }
}
