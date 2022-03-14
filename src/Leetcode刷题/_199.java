package LeetcodeÀ¢Ã‚;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lusir
 * @date 2022/3/10 - 22:57
 **/
public class _199 {
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

    int h=0;
    List<Integer> res=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        dfs(root,1);
        return res;
    }
    public  void dfs(TreeNode root,int index){
        if(root==null) return;
        if(index>h) {
            res.add(root.val);
        }
        h=Math.max(h,index);
        dfs(root.right,index+1);
        dfs(root.left,index+1);

    }
}
