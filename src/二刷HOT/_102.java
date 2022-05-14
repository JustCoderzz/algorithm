package ¶þË¢HOT;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author lusir
 * @date 2022/5/12 - 16:51
 **/
public class _102 {
    public List<List<Integer>> levelOrder(TreeNode root) {

        Deque<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        List<List<Integer>> res=new ArrayList<>();
        while (!queue.isEmpty()) {
            int size=queue.size();
            List<Integer> list=new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.pop();
                if (node.left!=null) queue.offer(node.left);
                if (node.right!=null) queue.offer(node.right);
                list.add(node.val);
            }
            res.add(list);
        }
        return res;
    }
}
