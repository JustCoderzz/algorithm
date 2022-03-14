package LeetcodeÀ¢Ã‚;

import java.util.*;

/**
 * @author lusir
 * @date 2022/3/7 - 10:28
 **/
public class _103 {
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null) return list;
        Deque<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        boolean flag=true;
        while(!queue.isEmpty()){
            LinkedList<Integer> nodes=new LinkedList<>();
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
                if(flag){
                    nodes.addLast(node.val);
                }else{
                    nodes.addFirst(node.val);
                }
            }
            flag=!flag;
            list.add(nodes);

        }
        return list;
    }
}
