package LeetcodeÀ¢Ã‚;

/**
 * @author lusir
 * @date 2022/4/21 - 23:28
 **/
public class _1884 {
    public int twoEggDrop(int n) {
        int[][] dp = new int[3][n + 1];
        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= 2; i++) {
                dp[i][j] = 1 + dp[i][j - 1] + dp[i - 1][j - 1];
                if (dp[i][j] >= n) {
                    return j;
                }
            }
        }
        return n;
    }
}
