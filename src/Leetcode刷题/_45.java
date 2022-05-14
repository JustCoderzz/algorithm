package LeetcodeÀ¢Ã‚;

import java.util.Arrays;

/**
 * @author lusir
 * @date 2022/4/29 - 0:34
 **/
public class _45 {
    public int jump(int[] nums) {
//        int n=nums.length;
//        int dp[]=new int[n];
//        Arrays.fill(dp,Integer.MAX_VALUE);
//        dp[0]=0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 1; j <= nums[i]; j++) {
//                if ((i+j)>=n) break;
//                dp[i+j]=Math.min(dp[i+j],dp[i]+1);
//            }
//        }
//        return dp[n-1];
        int n=nums.length;
        int maxPos=0;
        int end=0;
        int res=0;
        for (int i = 0; i <n; i++) {
            maxPos=Math.max(maxPos,i+nums[i]);
            if (i==end) {
                end=maxPos;
                res++;
            }
        }
        return res;
    }
}
