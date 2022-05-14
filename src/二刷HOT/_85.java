package ¶þË¢HOT;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author lusir
 * @date 2022/5/12 - 18:48
 **/
public class _85 {
    public int maximalRectangle(char[][] matrix) {
        int[] heights=new int[matrix[0].length];
        int res=1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                heights[j]=matrix[i][j]=='1'?heights[j]+1:0;
            }
            res=Math.max(res,largestRectangleArea(heights));
        }
        return res;
    }

    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        if (n==1) return heights[0];
        int[] newHeights=new int[n+2];
        System.arraycopy(heights,0,newHeights,1,n);
        newHeights[0]=0;
        newHeights[n+1]=0;
        Deque<Integer> stack=new ArrayDeque<>();
        heights=newHeights;
        stack.push(0);
        int res=0;
        for (int i = 1; i < n+2; i++) {
            while (heights[i]<heights[stack.peek()]) {
                int curH=heights[stack.pop()];
                int curW=i-stack.peek()-1;
                res=Math.max(res,curH*curW);
            }
            stack.push(i);
        }
        return res;
    }
}
