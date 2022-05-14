package LeetcodeË¢Ìâ;

/**
 * @author lusir
 * @date 2022/4/28 - 13:12
 **/
public class _108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        int n=nums.length;
        return buildTree(nums,0,n-1);
    }

    public TreeNode buildTree(int nums[],int left,int right) {
        if (left>right) return null;
        int mid=(left+right)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=buildTree(nums,left,mid-1);
        root.right=buildTree(nums,mid+1,right);
        return root;
    }
}
  class TreeNode {
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
