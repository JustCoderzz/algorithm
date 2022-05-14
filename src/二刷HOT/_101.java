package ¶þË¢HOT;

/**
 * @author lusir
 * @date 2022/5/12 - 16:58
 **/
public class _101 {
    public boolean isSymmetric(TreeNode root) {
        return root==null||isSymmetricNode(root.left,root.right);
    }

    public boolean isSymmetricNode(TreeNode node1,TreeNode node2) {
        if (node1==null&&node2==null) return true;
        if (node1==null||node2==null) return false;
        return node1.val==node2.val&&isSymmetricNode(node1.right,node2.left)
                &&isSymmetricNode(node1.left,node2.right);
    }
}
