package ½£Ö¸OFFER;

import java.util.*;

/**
 * @author lusir
 * @date 2021/11/23 - 13:24
 **/
public class offer_59_II {
    Queue<Integer> q;
    Deque<Integer> d;

//    public MaxQueue() {
//        q = new LinkedList<Integer>();
//        d = new LinkedList<Integer>();
//    }
//
//    public int max_value() {
//        if (d.isEmpty()) {
//            return -1;
//        }
//        return d.peekFirst();
//    }
//
//    public void push_back(int value) {
//        while (!d.isEmpty() && d.peekLast() < value) {
//            d.pollLast();
//        }
//        d.offerLast(value);
//        q.offer(value);
//    }
//
//    public int pop_front() {
//        if (q.isEmpty()) {
//            return -1;
//        }
//        int ans = q.poll();
//        if (ans == d.peekFirst()) {
//            d.pollFirst();
//        }
//        return ans;
//    }


//    Deque<Integer> deque1;
//    PriorityQueue<Integer> queue2;
//
//class MaxQueue {
//
//    public MaxQueue() {
//        deque1=new LinkedList<>();
//        queue2=new PriorityQueue<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        });
//    }
//
//    public int max_value() {
//        if(deque1.isEmpty()){
//            return -1;
//        }else{
//            return queue2.peek();
//        }
//
//    }
//
//    public void push_back(int value) {
//        deque1.offer(value);
//        queue2.offer(value);
//    }
//
//    public int pop_front() {
//        if(deque1.isEmpty()){
//            return  -1;
//        }else {
//            int num=deque1.pop();
//            queue2.remove(num);
//            return num;
//
//        }
//    }
//}
}
