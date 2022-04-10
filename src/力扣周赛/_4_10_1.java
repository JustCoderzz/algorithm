package ¡¶ø€÷‹»¸;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author lusir
 * @date 2022/4/10 - 10:31
 **/
public class _4_10_1 {
    public int largestInteger(int num) {
        Queue<Integer> queue1=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        Queue<Integer> queue2=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        int a=num;
        while (a!=0){
            int n=a%10;
            a/=10;
            if ((n&1)==0) queue1.offer(n);
            else queue2.offer(n);
        }
        String b=num+"";
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < b.length(); i++) {
            int n= b.charAt(i)-'0';
            if ((n&1)==0){
                sb.append(queue1.poll());
            }else{
                sb.append(queue2.poll());
            }
        }
        return  Integer.parseInt(sb.toString());

    }
}
