package ¶şË¢Á¦¿Û;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author lusir
 * @date 2022/4/5 - 9:50
 **/
public class _56 {
    public int [][] merge(int [][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0]!=o2[0]) {
                    return o1[0]-o2[0];
                }else{
                    return  o1[1]-o2[1];
                }
            }
        });
        int[]pre=intervals[0];
        List<int[]> res=new ArrayList<>();
        int n=intervals.length;
        for (int i = 1; i < n; i++) {
            if (intervals[i][0]>pre[1]) {
                res.add(pre);
                pre=intervals[i];
            }else if (intervals[i][1]>pre[1]){
                int []tmp=new int[]{pre[0],intervals[i][1]};
                pre=tmp;
            }
        }
        res.add(pre);
        return res.toArray(new int[res.size()][]);
    }
}
