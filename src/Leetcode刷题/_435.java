package LeetcodeË¢Ìâ;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author lusir
 * @date 2022/2/24 - 12:53
 **/
public class _435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        int prev=intervals[0][1];
        int count=0;
        for(int i=1;i<intervals.length;i++){
            if (intervals[i][0]<prev){
                count++;
            }else{
                prev=intervals[i][1];
            }
        }
        return count;
    }
}
