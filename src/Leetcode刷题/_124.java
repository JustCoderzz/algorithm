package LeetcodeÀ¢Ã‚;

/**
 * @author lusir
 * @date 2022/3/11 - 15:14
 **/
public class _124 {
    public  class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(){};
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }

    int max=Integer.MIN_VALUE;
    public  int MaxPathSum(TreeNode root){

        dfs(root);
        return max;

    }

    public int dfs(TreeNode root){
        if(root==null) return 0;

        int left=Math.max(dfs(root.left),0);
        int right=Math.max(dfs(root.right),0);

        int sum=left+right+root.val;
        max=Math.max(max,sum);

        return root.val+Math.max(left,right);


    }
}
