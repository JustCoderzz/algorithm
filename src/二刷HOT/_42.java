package ��ˢHOT;

import java.awt.*;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author lusir
 * @date 2022/5/11 - 10:35
 **/
public class _42 {
    /**
     * ����ά��һ�������ݼ�ջ  ����ջԪ�ش���ջ��ʱ���ϼ���
     * @param height
     * @return
     */
    public int trap(int[] height) {

        Deque<Integer> stack=new ArrayDeque<>();
        int WaterCount=0;
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty()&&height[i]> height[stack.peek()]){
//                ���������ˮ�ĵ�
                int bottom=stack.pop();
                if (stack.isEmpty()) break;
                int W=i-stack.peek()-1;
                int H=Math.min(height[stack.peek()],height[i])-height[bottom];
                WaterCount+=W*H;
            }

            stack.push(i);
        }
        return WaterCount;
    }
}
