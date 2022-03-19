package LeetcodeÀ¢Ã‚;

/**
 * @author lusir
 * @date 2022/3/16 - 10:12
 **/
public class _958 {
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

     int n=0;
     int max=0;
    public boolean isCompleteTree(TreeNode root) {

        dfs(root,1);
        return n==max;
    }

    public  void dfs(TreeNode root,int k){
        if(root==null) return;
        n++;
        max=Math.max(max,k);
        dfs(root.left,2*k);
        dfs(root.right,2*k+1);
    }
}
