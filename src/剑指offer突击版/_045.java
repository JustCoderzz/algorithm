package ½£Ö¸offerÍ»»÷°æ;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author lusir
 * @date 2022/4/1 - 9:58
 **/
public class _045 {
      public class TreeNode {
      int val;
     TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

  int maxDepth=0;
    int res;
    public int findBottomLeftValue(TreeNode root) {

//        Deque<TreeNode> queue=new LinkedList<>();
//        queue.offer(root);
//        TreeNode leastLeft=root;
//        while (!queue.isEmpty()) {
//            int size=queue.size();
//            boolean flag=false;
//            for (int i=0;i<size;i++) {
//                TreeNode node=queue.poll();
//                if (flag==false) {
//                    leastLeft=node;
//                    flag=true;
//                }
//                if (node.left!=null) queue.offer(node.left);
//                if (node.right!=null) queue.offer(node.right);
//            }
//        }
//        return leastLeft.val;
    }
    void dfs(TreeNode root,int level) {
        if (root==null) return;
        if (level>maxDepth) {
            res=root.val;
            maxDepth=level;
        }
        dfs(root.left,level+1);
        dfs(root.right,level+1);
    }


}
