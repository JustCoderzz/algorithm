package LeetcodeÀ¢Ã‚;

/**
 * @author lusir
 * @date 2022/3/21 - 19:22
 **/
public class _230 {
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
    int flag=0;
      int res=-1;
    public int kthSmallest(TreeNode root, int k) {
        dfs(root,k);
        return res;

    }
    public  void dfs(TreeNode root,int k){
        if(root==null||res!=-1) return ;
        dfs(root.left,k);
        flag++;
        if(flag==k) {
            res=root.val;
            return;
        }
        dfs(root.right,k);

    }
}
