package LeetcodeÀ¢Ã‚;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lusir
 * @date 2022/3/12 - 19:00
 **/
public class _113 {
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

    List<List<Integer>> res=new ArrayList<>();
    List<Integer> list=new ArrayList<>();
    int target;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        this.target=targetSum;

        backTrace(root,0);
        return res;
    }

    public  void  backTrace(TreeNode root,int sum){
        if(root==null) return;
        list.add(root.val);
        sum+=root.val;

        if(sum==target&&root.left==null&&root.left==null){
            res.add(new ArrayList<>(list));
            return;
        }
        backTrace(root.left,sum);
        backTrace(root.right,sum);
        list.remove(list.size()-1);
    }

}
