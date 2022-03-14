package 剑指OFFER;

import java.util.Stack;

/**
 * @author lusir
 * @date 2021/11/19 - 12:40
 **/
public class offer_33 {

//      单调栈  不太懂  日后在看
//    public boolean verifyPostorder(int[] postorder) {
//        Stack<Integer> stack = new Stack<>();
//        int root = Integer.MAX_VALUE;
//        for(int i = postorder.length - 1; i >= 0; i--) {
//            if(postorder[i] > root) return false;
//            while(!stack.isEmpty() && stack.peek() > postorder[i])
//                root = stack.pop();
//            stack.add(postorder[i]);
//        }
//        return true;
//    }



    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder, 0, postorder.length - 1);
    }
    boolean recur(int[] postorder, int i, int j) {
        if(i >= j) return true;
        int p = i;
        while(postorder[p] < postorder[j]) p++;
        int m = p;
        while(postorder[p] > postorder[j]) p++;
        return p == j && recur(postorder, i, m - 1) && recur(postorder, m, j - 1);
    }
}
