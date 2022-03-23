package LeetcodeÀ¢Ã‚;

/**
 * @author lusir
 * @date 2022/3/22 - 0:32
 **/
public class _114 {
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
    public  void flatten(TreeNode root){

          while(root!=null){
              if(root.left==null){
                  root=root.right;
              }else{
                  TreeNode node=root.left;
                  while (root.right!=null){
                      node= node.right;
                  }
                  node.right=root.right;
                  root.right=root.left;
                  root.left=null;
                  root=root.right;
              }
          }
    }


}
