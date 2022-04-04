package ½£Ö¸OFFER;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author lusir
 * @date 2022/4/4 - 15:24
 **/
public class offer_043_II {
    class CBTInserter {
        TreeNode root;
        Deque<TreeNode> queue;

        public CBTInserter(TreeNode root) {
            this.root=root;
            queue=new LinkedList<>();
            queue.offerLast(root);
        }

        public int insert(int v) {
            TreeNode node=new TreeNode(v);
            while (queue.peekFirst().left!=null&&queue.peekFirst().right!=null) {
                TreeNode tmp = queue.pollFirst();
                queue.offerLast(tmp.left);
                queue.offerLast(tmp.right);
            }
            TreeNode peekNode=queue.peekFirst();
            if (peekNode.left==null){
                peekNode.left=node;
            }else {
                peekNode.right=node;
            }
            return peekNode.val;
        }

        public TreeNode get_root() {
            return  root;
        }
    }
}
