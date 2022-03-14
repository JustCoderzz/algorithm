package ¶þË¢Á¦¿Û;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author lusir
 * @date 2022/3/9 - 23:24
 **/
public class _42 {
    public  int trap(int[] height){
        Deque<Integer> stack=new LinkedList<>();
        int res=0;

        for(int i=0;i<height.length;i++){
            while(!stack.isEmpty()&&height[i]>height[stack.peek()]){
                int top=stack.pop();
                if(stack.isEmpty()) break;
                int left=stack.peek();
                int curW=i-left-1;
                int curH=Math.min(height[i],height[left])-height[top];
                res+=curH*curW;
            }
            stack.push(i);
        }
        return res;

    }
}
