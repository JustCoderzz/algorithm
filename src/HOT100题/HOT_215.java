package HOT100Ã‚;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author lusir
 * @date 2021/11/29 - 20:04
 **/
public class HOT_215 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int num : nums) {
            heap.add(num);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        return heap.peek();
//        Queue<Integer> queue=new PriorityQueue<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1-o2;
//            }
//        });
//        int i=0;
//        for(;i<k;i++){
//            queue.offer(nums[i]);
//        }
//        for(;i<nums.length;i++){
//            if(nums[i]>queue.peek()){
//                queue.poll();
//                queue.offer(nums[i]);
//            }
//        }
//        return queue.peek();
    }
}
