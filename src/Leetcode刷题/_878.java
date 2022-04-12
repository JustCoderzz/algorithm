package LeetcodeÀ¢Ã‚;

import java.util.PriorityQueue;

/**
 * @author lusir
 * @date 2022/4/11 - 23:02
 **/
public class _878 {
    final int mod = (int) 1e9 + 7;
    public int nthMagicalNumber(int n, int a, int b) {
        long ans = 0;
        long l = 0, r = (long) Math.min(a, b) * n;
        long lcm = this.lcm(a, b);
        while (l <= r) {
            long m = l + ((r - l) >> 1);
            long N = m / a + m / b - m / lcm;
            if (N < n) {
                l = m + 1;
                ans = l;
            } else {
                r = m - 1;
            }
        }
        return (int) (ans % mod);
    }

    private long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }
}
