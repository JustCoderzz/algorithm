package 剑指OFFER;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author lusir
 * @date 2021/11/20 - 9:36
 **/
public class offer_59 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0 || k == 0) return new int[0];
        Deque<Integer> deque = new LinkedList<>();//单减队列
        int[] res = new int[nums.length - k + 1];
        for(int j = 0, i = 1 - k; j < nums.length; i++, j++) {
            // 删除 deque 中对应的 nums[i-1]
            if(i > 0 && deque.peekFirst() == nums[i - 1])//如果队列的首部也就是最大值是滑动窗口的前一个的话，就把它移除掉
                deque.removeFirst();
            // 保持 deque 递减
            while(!deque.isEmpty() && deque.peekLast() < nums[j])//当新值大于队列的末尾值时，开始删除队尾，直到满足递减
                deque.removeLast();
            deque.addLast(nums[j]);
            // 记录窗口最大值
            if(i >= 0)
                res[i] = deque.peekFirst();
        }
        return res;
    }



//    个人的做法
//    public int[] maxSlidingWindow(int[] nums, int k) {
//        if(nums.length==0) return new int[0];
//        List<Integer> list=new ArrayList<>();
//        int left=0;
//        int right=k-1;
//        int max=Integer.MIN_VALUE;
//        int maxIndex=-1;
//        for(int i=left;i<=right;i++){
//            if(nums[i]>max){
//                max=nums[i];
//                maxIndex=i;
//            }
//        }
//        list.add(max);
//        left++;
//        right++;
//        while (right<nums.length){
//                if(nums[right]>max) {
//                    max = nums[right];
//                    maxIndex = right;
//                    list.add(max);
//                }else if(maxIndex>=left){
//                    list.add(max);
//                }else{
//                    max=Integer.MIN_VALUE;
//                    for(int i=left;i<=right;i++){
//                        if(nums[i]>max){
//                            max=nums[i];
//                            maxIndex=i;
//                        }
//                    }
//                    list.add(max);
//                }
//                left++;
//                right++;
//
//
//        }
//        int [] res=new int[list.size()];
//        for(int i=0;i<list.size();i++){
//            res[i]=list.get(i);
//        }
//        return res;
//    }
}
