package HOT100Ã‚;

/**
 * @author lusir
 * @date 2021/11/29 - 19:32
 **/
public class HOT_538 {
    int num=0;
    public TreeNode convertBST(TreeNode root) {

        BST(root);
        return root;



    }
    public void BST(TreeNode root){
        if(root==null) return;
        BST(root.right);
        root.val+=num;
        num=root.val;
        BST(root.left);
    }
}
