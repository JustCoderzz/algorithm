package ��˾����.shopee;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author lusir
 * @date 2022/4/10 - 22:09
 **/
public class _4_10_1 {
    //    ����һ�����������飬�����������������������ɵ������������ �� {4, 2, 3} �� 432 ��
    public int maxIntValue(int[] arrs) {

        Queue<Integer> queue=new PriorityQueue<>(((o1, o2) -> o2-o1));
        for(int num:arrs) {
            queue.offer(num);
        }
        int num=queue.poll();
        while (!queue.isEmpty()) {
            num=num*10+queue.poll();
        }
        return num;
    }
}
