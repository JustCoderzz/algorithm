package 三刷力扣;

import java.util.Arrays;

/**
 * @author lusir
 * @date 2022/4/27 - 20:41
 **/
public class _673 {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n + 1];
        int[] record = new int[n + 1];
//        最长递增子序列的长度
        int maxL = 1;
//        最长递增子序列的个数
        Arrays.fill(dp, 1);
        Arrays.fill(record, 1);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                if (nums[i - 1] > nums[j - 1]) {
                    if (dp[j] + 1 > dp[i]) {
                        dp[i] = dp[j] + 1;
                        record[i] = record[j];
                    } else if (dp[j] + 1 == dp[i]) {
                        record[i] += record[j];
                    }
                }
            }
            maxL = Math.max(maxL, dp[i]);
        }
        int res = 0;
        for (int i = 1; i <= n; i++) {
            if (dp[i] == maxL) {
                res += record[i];
            }
        }
        return res;
    }
}

