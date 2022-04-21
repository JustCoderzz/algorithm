package ¶þË¢½£Ö¸;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author lusir
 * @date 2022/4/18 - 12:41
 **/
public class _33 {
    public boolean verifyPostorder(int[] postorder) {
        int n=postorder.length;
        Deque<Integer> stack=new ArrayDeque<>();
        int root=Integer.MAX_VALUE;
        for (int i=n-1;i>=0;i--) {
            if (postorder[i]>root) return false;
            while (!stack.isEmpty()&&postorder[i]<stack.peek()){
                root=stack.pop();
            }
            stack.push(postorder[i]);
        }
        return true;
    }
}
