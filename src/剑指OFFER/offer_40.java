package ½£Ö¸OFFER;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author lusir
 * @date 2021/11/10 - 20:38
 **/
public class offer_40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        int [] res=new int[k];
        if(k==0) return  res;
        PriorityQueue<Integer> queue=new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for(int i=0;i<k;++i){
            queue.offer(arr[i]);
        }
        for(int i=k;i<arr.length;++i){
            if(queue.peek()>arr[i]){
                queue.poll();
                queue.offer(arr[i]);
            }
        }
        for(int i=0;i<k;i++){
            res[i]=queue.poll();
        }
        return res;
    }
}
