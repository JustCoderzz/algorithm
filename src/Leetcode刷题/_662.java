package LeetcodeÀ¢Ã‚;

import com.sun.org.apache.regexp.internal.REUtil;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author lusir
 * @date 2022/3/17 - 10:20
 **/
public class _662 {
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

  int res=0;
      Map<Integer,Integer> map;
    public int widthOfBinaryTree(TreeNode root) {

        map=new HashMap();
        dfs(root,0,0);
        return res;
    }

    public  void dfs(TreeNode root,int depth,int pos){
          if(root==null) return;
          if(!map.containsKey(depth)) map.put(depth,pos);
          res=Math.max(res,pos-map.get(depth)+1);
          dfs(root.left,depth+1,2*pos);
          dfs(root.right,depth+1,2*pos+1);
    }
}
