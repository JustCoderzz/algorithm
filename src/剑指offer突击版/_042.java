package ½£Ö¸offerÍ»»÷°æ;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author lusir
 * @date 2022/4/8 - 22:32
 **/
public class _042 {
    class RecentCounter {

        Queue<Integer> queue;
        public RecentCounter() {
            queue=new LinkedList<>();
        }

        public int ping(int t) {
            queue.offer(t);
            while (queue.peek()<t-3000) {
                queue.poll();
            }
            return queue.size();
        }
    }
}
