package ½£Ö¸OFFER;

/**
 * @author lusir
 * @date 2022/4/4 - 23:39
 **/
public class offer_053_II {
    boolean flag=false;
    TreeNode res;
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        dfs(root,p);
        return res;
    }

    public void dfs(TreeNode root,TreeNode p) {
        if (root==null||flag) return;
        dfs(root.left,p);
        if (root.val>p.val&&flag==false) {
            flag=true;
            res=root;
        }
        dfs(root.right,p);
    }
}
