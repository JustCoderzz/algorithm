package 代码随想录;

/**
 * @author lusir
 * @date 2021/12/8 - 14:25
 **/
public class Code_337 {

    public int rob(TreeNode root) {
        int []res=rob3(root);
        return Math.max(res[0],res[1]);
    }

    public int[] rob3(TreeNode root){
        int []res=new int[2];
        if(root==null) return res;

        int []left=rob3(root.left);
        int []right=rob3(root.right);
//      不偷根
        res[0]=Math.max(left[0],left[1])+Math.max(right[0],right[1]);
//        偷根
        res[1]=root.val+left[0]+right[0];

        return res;
    }


//   暴力递归   时间会超出
//    public int rob(TreeNode root) {
//        if (root == null)
//            return 0;
//        int money = root.val;
//        if (root.left != null) {
//            money += rob(root.left.left) + rob(root.left.right);
//        }
//        if (root.right != null) {
//            money += rob(root.right.left) + rob(root.right.right);
//        }
//        return Math.max(money, rob(root.left) + rob(root.right));
//
//
//
//    }







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
}
