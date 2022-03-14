package ½£Ö¸OFFER;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author lusir
 * @date 2021/11/26 - 10:19
 **/
public class offer_41 {
    class MedianFinder {
      final   Queue<Integer> queue;
        /** initialize your data structure here. */
        public MedianFinder() {
            queue=new PriorityQueue<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1-o2;
                }
            });
        }

        public void addNum(int num) {
            queue.offer(num);
        }

        public double findMedian() {

        }
    }
}
