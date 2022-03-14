package ½£Ö¸OFFER;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author lusir
 * @date 2021/11/21 - 10:46
 **/
public class offer_62 {
    public int lastRemaining(int n, int m) {
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<n;i++){
            queue.offer(i);
        }
        int count=1;
        while(queue.size()!=1){

            if(count==m){
                queue.poll();
                count=1;
            }else{
                queue.offer(queue.poll()) ;
                count++;
            }

        }
        return queue.peek();
    }
}
