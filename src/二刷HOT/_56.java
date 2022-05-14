package ¶şË¢HOT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lusir
 * @date 2022/5/11 - 22:43
 **/
public class _56 {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals,((o1, o2) -> o1[0]-o2[0]));
        List<int[]> res=new ArrayList<>();
        int[] pre=intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0]>pre[1]){
                res.add(pre);
                pre=intervals[i];
            }else if (intervals[i][1]>pre[1]){
                pre=new int[]{pre[0],intervals[i][1]};
            }
        }
        res.add(pre);
        return res.toArray(new int[res.size()][]);
    }
}
