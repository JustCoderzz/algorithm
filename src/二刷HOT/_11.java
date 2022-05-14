package ¶þË¢HOT;

import javax.annotation.Resource;

/**
 * @author lusir
 * @date 2022/5/9 - 21:08
 **/
public class _11 {
    public int maxArea(int[] height) {
        int maxRes=0;
        int i=0;
        int j=height.length-1;
        while (i<j) {
            int W=j-i;
            int H=Math.min(height[i],height[j]);
            maxRes=Math.max(maxRes,W*H);
            if (height[i]>height[j]){
                j--;
            }else i++;
        }
        return maxRes;
    }
}
