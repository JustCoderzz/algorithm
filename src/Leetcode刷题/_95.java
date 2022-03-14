package LeetcodeÀ¢Ã‚;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author lusir
 * @date 2022/3/12 - 23:03
 **/
public class _95 {
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


        public List<TreeNode> generateTrees(int n) {
            return backTrace(1,n);
        }

            public  List<TreeNode>  backTrace(int l,int r){
            List<TreeNode> list=new LinkedList<>();
            if(l>r){
                list.add(null);
                return list;
            }

            for(int i=l;i<=r;i++){

                List<TreeNode> leftNodes=backTrace(l,i-1);
                List<TreeNode> rightNodes=backTrace(i+1,r);

                for(TreeNode left:leftNodes){
                    for(TreeNode right:rightNodes){
                        TreeNode root=new TreeNode(i);
                        root.left=left;
                        root.right=right;
                        list.add(root);
                    }
                }
            }
            return list;
    }
}
