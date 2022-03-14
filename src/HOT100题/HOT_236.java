package HOT100题;

/**
 * @author lusir
 * @date 2021/11/29 - 14:24
 **/
public class HOT_236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left == null) return right;
        if(right == null) return left;
        return root;
    }


//    个人做法  和标准做法相同只是 写法有点复杂
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//
//        return dfs(root,p,q);
//
//    }
//
//    public  TreeNode dfs(TreeNode root,TreeNode p, TreeNode q){
//        if(root==null) return null;
//        if(root==p){
//            return p;
//        }else if(root==q){
//            return q;
//        }else{
//            TreeNode left=dfs(root.left,p,q);
//            TreeNode right=dfs(root.right,p,q);
//            if(left!=null&&right!=null){
//                return root;
//            }else if(left!=null){
//                return left;
//            }else{
//                return right;
//            }
//        }
//    }
}
