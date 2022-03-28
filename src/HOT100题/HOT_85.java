package HOT100Ã‚;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author lusir
 * @date 2022/3/28 - 0:36
 **/
public class HOT_85 {
    public int maximalRectangle(char[][] matrix) {
        int heights[]=new int[matrix[0].length];
        int res=1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]=='1'){
                    heights[j]++;
                }else {
                    heights[j]=0;
                }

            }
            res=Math.max(res,largestRectangleArea(heights));
        }
        return res;
    }

    int largestRectangleArea(int heights[]) {
        int res=1;
        int []h=new int[heights.length+2];
        System.arraycopy(heights,0,h,1,heights.length);
        Deque<Integer> stack=new ArrayDeque<>();
        for (int i = 0; i < h.length; i++) {
            while (!stack.isEmpty()&&h[stack.peek()]>h[i]) {
                int height=stack.pop();
                res=Math.max(res,(i-stack.peek()-1)*height);
            }
            stack.push(i);
        }
        return res;
    }
}
