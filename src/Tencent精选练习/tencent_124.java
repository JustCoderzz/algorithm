package Tencent精选练习;


import java.util.NavigableSet;

/**
 * @author lusir
 * @date 2021/11/22 - 13:24
 **/
public class tencent_124 {
//    自己单独完成 哈哈哈
    int maxNode=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root==null) return 0;
        dfsMaxPath(root);
        return maxNode;



    }
    public  int dfsMaxPath(TreeNode root){
        if(root==null) return 0;

        int left=Math.max(dfsMaxPath(root.left),0);
        int right=Math.max(dfsMaxPath(root.right),0);
        int _max=root.val+left+right;

        maxNode=Math.max(maxNode,_max);

        return root.val+Math.max(left,right);

    }






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

