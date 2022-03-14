package LeetcodeÀ¢Ã‚;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author lusir
 * @date 2022/2/24 - 13:47
 **/
public class _452 {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        int count=0;
        int pre=points[0][1];
        for(int i=1;i<points.length;i++){
            if(points[i][0]>pre){
                count++;
                pre=points[i][1];
            }
        }
        return count;
    }
}
