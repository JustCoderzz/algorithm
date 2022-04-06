package 公司真题.腾讯音乐互娱;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author lusir
 * @date 2022/4/6 - 18:49
 **/
public class _4_6_4 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode cyclicShiftTree(TreeNode root, int k) {

        Deque<TreeNode> deque=new LinkedList<>();
        Deque<TreeNode> queue=new LinkedList<>();
        deque.offerLast(root);
        while (!deque.isEmpty()) {
            int size=deque.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = deque.pollFirst();
                if (node==null) continue;
                queue.offer(node);
                deque.offerLast(node.left);
                deque.offerLast(node.right);
            }
            for (int i=0;i<k;i++) {
                deque.offerFirst(deque.pollLast());
            }
            while (!queue.isEmpty()) {
                TreeNode head = queue.poll();
                if (head!=null) {
                    TreeNode left= deque.pollFirst();
                    TreeNode right=deque.pollFirst();
                    head.left=left;
                    head.right=right;
                    deque.offerLast(left);
                    deque.offerLast(right);
                }
            }
        }
        return root;
    }
}
