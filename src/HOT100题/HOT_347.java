package HOT100题;

import java.util.*;

/**
 * @author lusir
 * @date 2021/11/2 - 15:07
 **/
public class HOT_347 {
//    参考官方做法
    public int[] topKFrequent(int[] nums, int k) {
//        将每个数字的次数存放到map中
        Map<Integer,Integer> occurrences=new HashMap<>();
        for (int num:nums){
            occurrences.put(num,occurrences.getOrDefault(num,0)+1);
        }

        PriorityQueue<int[]> queue=new PriorityQueue<int[]>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });

        for(Map.Entry<Integer,Integer> entry:occurrences.entrySet()){
            int key=entry.getKey();
            int value=entry.getValue();
            if(queue.size()==k){
                if(queue.peek()[1]<value){
                    queue.poll();
                    queue.offer(new int[]{key,value});
                }
            }else{
                queue.offer(new int[]{key,value});
            }

        }

        int []ret=new int[k];
        for(int i=0;i<k;i++){
            ret[i]=queue.poll()[0];
        }
        return ret;
    }
}
