package HOT100Ìâ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author lusir
 * @date 2022/2/26 - 20:36
 **/
public class Hot_56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        int []pre=intervals[0];
        List<int []> res=new ArrayList<>();
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>pre[1]){
                res.add(pre);
                pre=intervals[i];
            }else if (intervals[i][1]>pre[1]){
                int []tmp={pre[0],intervals[i][1]};
                pre=tmp;
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
