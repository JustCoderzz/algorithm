package ¶þË¢Á¦¿Û;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author lusir
 * @date 2022/4/13 - 23:20
 **/
public class _103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        Deque<TreeNode> queue=new LinkedList<>();
        if (root==null) return res;
        queue.offer(root);
        boolean flag=true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            LinkedList<Integer> list=new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left!=null)  queue.offer(node.left);
                if (node.right!=null) queue.offer(node.right);
                if (flag){
                    list.addLast(node.val);
                }else{
                    list.addFirst(node.val);
                }
            }
            flag=!flag;
            res.add(list);
        }
        return res;
    }
}



