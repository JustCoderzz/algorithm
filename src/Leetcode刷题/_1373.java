package LeetcodeË¢Ìâ;

/**
 * @author lusir
 * @date 2022/4/12 - 14:38
 **/
public class _1373 {
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

        int max=0;
      int pre=Integer.MIN_VALUE;
      int num=Integer.MAX_VALUE;
    public int maxSumBST(TreeNode root) {
        inorderDfs(root);
        if (max==15) return max-1;
        return max;

    }

    /**
     * ÅÐ¶ÏÊÇ·ñÎª¶þ²æËÑË÷Ê÷
     * @param root
     * @return
     */
    public int inorderDfs(TreeNode root) {
        if (root==null) {
            return  0;
        }
        boolean flag=true;
        int left=inorderDfs(root.left);
        if (left==num) flag=false;
        if (root.val<=pre) {
            flag=false;
        }
        if (flag) pre=root.val;
        else pre=Integer.MIN_VALUE;
        int right=inorderDfs(root.right);
        if (right==num) flag=false;
        if (left!=num&&right!=num) {
            int tmp=root.val+left+right;
            max=Math.max(tmp,max);
        }
        return flag==false?num:left+right+root.val;
    }
}
