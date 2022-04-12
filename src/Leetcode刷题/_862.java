package LeetcodeÀ¢Ã‚;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author lusir
 * @date 2022/4/12 - 21:19
 **/
public class _862 {
    public int shortestSubarray(int[] nums, int k) {
        int n = nums.length;
        long[] sum = new long[n + 1];
        for (int i=1;i<=n;i++) sum[i] = sum[i - 1] + nums[i - 1];

        Deque<Integer> q = new LinkedList<>();
        int minLength = Integer.MAX_VALUE;
        for (int i=0;i<=n;i++) {

            while (!q.isEmpty() && sum[q.peekLast()] >= sum[i]) q.pollLast();

            while (!q.isEmpty() && sum[i] - sum[q.peekFirst()] >= k) {

                minLength = Math.min(minLength, i - q.pollFirst());
            }
            q.addLast(i);
        }
        if (minLength == Integer.MAX_VALUE) return -1;
        else return minLength;
    }
}
