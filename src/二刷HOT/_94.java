package ¶þË¢HOT;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author lusir
 * @date 2022/5/12 - 17:24
 **/
public class _94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        Deque<TreeNode> stack=new ArrayDeque<>();
        TreeNode node=root;
        while (!stack.isEmpty()||node!=null){
            while (node!=null) {
                stack.push(node);
                node=node.left;
            }
            node=stack.pop();
            res.add(node.val);
            node=node.right;
        }
        return res;
    }
}
