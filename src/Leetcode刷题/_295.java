package LeetcodeÀ¢Ã‚;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author lusir
 * @date 2022/4/13 - 13:37
 **/
public class _295 {
    class MedianFinder {
        Queue<Integer> minQ;
        Queue<Integer> maxQ;

        public MedianFinder() {
            minQ=new PriorityQueue<>((o1,o2)->(o2-o1));
            maxQ=new PriorityQueue<>((o1, o2)->(o1-o2));
        }

        public void addNum(int num) {
            if (minQ.isEmpty()||num<=minQ.peek()) {
                minQ.offer(num);
                if (minQ.size()>maxQ.size()+1) {
                    maxQ.offer(minQ.poll());
                }
            }else{
                maxQ.offer(num);
                if (maxQ.size()>minQ.size()) {
                    minQ.offer(maxQ.poll());
                }
            }
        }

        public double findMedian() {
            if (minQ.size()>maxQ.size()) {
                return minQ.peek();
            }else{
                return (minQ.peek()+maxQ.peek())/2.0;
            }
        }
    }
}
