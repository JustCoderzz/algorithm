package 代码随想录;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author lusir
 * @date 2021/12/2 - 13:08
 **/
public class Code_42 {
    public int trap(int[] height) {
//        牛逼的双指针做法
        int res=0;
        int left=0;
        int right=height.length-1;
        int leftMax=0;
        int rightMax=0;
        while(left<right){
            leftMax=Math.max(leftMax,height[left]);
            rightMax=Math.max(rightMax,height[right]);
            if(height[left]<height[right]){
                res+=leftMax-height[left];
                left++;
            }else{
                res+=rightMax-height[right];
                right--;
            }
        }
        return res;






//        单调栈做法
//        Deque<Integer> stack=new LinkedList<>();
//        int sum=0;
//        for(int i=0;i<height.length;i++){
//            while (!stack.isEmpty()&&height[i]>height[stack.peek()]){
//                int top=stack.pop();
//                if(stack.isEmpty()) break;
//                int left=stack.peek();
//                int w=i-left-1;
//                int h=Math.min(height[i],height[left])-height[top];
//                sum+=w*h;
//
//            }
//            stack.push(i);
//
//
//        }
//        return sum;
    }
}
