package HOT100Ã‚;

import org.omg.PortableServer.ForwardRequest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author lusir
 * @date 2021/11/5 - 18:05
 **/
public class HOT_406 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]!=o2[0]){
                    return o2[0]-o1[0];
                }else{
                    return  o1[1]-o2[1];
                }
            }
        });
        int n=people.length;
        List<int[]> res=new ArrayList<>();
        for(int []p:people){
            res.add(p[1],p);
        }
        return res.toArray(new int[res.size()][]);

    }
}
