package HOT100Ã‚;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * @author lusir
 * @date 2022/3/28 - 10:00
 **/
public class HOT_84_2 {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        Deque<Integer> stack=new ArrayDeque<>();
        int[] nums=new int[n+2];
        nums[0]=0;
        System.arraycopy(heights,0,nums,1,n);
        nums[n+1]=0;
        n=n+2;
        stack.push(0);
        int res=0;
        for (int i=1;i<n;i++) {
            while (nums[i]<nums[stack.peek()]) {
                int h=nums[stack.pop()];
                int width=i-stack.peek()-1;
                res=Math.max(res,h*width);
            }
            stack.push(i);
        }
        return res;
    }
}
