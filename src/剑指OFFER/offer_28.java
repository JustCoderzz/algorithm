package ½£Ö¸OFFER;

/**
 * @author lusir
 * @date 2021/11/13 - 10:25
 **/
public class offer_28 {
        public boolean isSymmetric(TreeNode root) {
            if(root==null){
                return true;
            }

            return isSame(root.left,root.right);

        }

        public boolean isSame(TreeNode root1,TreeNode root2){
            if(root1==null&&root2==null) return true;
            if(root1==null||root2==null||root1.val!=root2.val) return false;
            return isSame(root1.left,root2.right)&&isSame(root1.right,root2.left);
        }
}
