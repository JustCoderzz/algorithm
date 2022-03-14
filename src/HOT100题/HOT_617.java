package HOT100题;

import HOT100题.TreeNode;

/**
 * @author lusir
 * @date 2021/10/27 - 13:10
 **/
public class HOT_617 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
//        1.判断两个结点是否为空，如果都为空，则不操作
//        2.若都不为空，则两值相加
//        3.若其中一个为空，则为其中一个的值
//        4.将root1作为新树返回

            if(root1==null&&root2==null) return null;
            if(root1==null&&root2!=null){
                root1=root2;
                return root1;
            }

            if(root1!=null&&root2!=null){
                root1.val=root1.val+root2.val;
                root1.left=mergeTrees(root1.left,root2.left);
                root1.right=mergeTrees(root1.right,root2.right);
            }

            return root1;

    }
//    官方解法
//    class Solution {
//        public HOT100题.TreeNode mergeTrees(HOT100题.TreeNode t1, HOT100题.TreeNode t2) {
//            if (t1 == null) {
//                return t2;
//            }
//            if (t2 == null) {
//                return t1;
//            }
//            HOT100题.TreeNode merged = new HOT100题.TreeNode(t1.val + t2.val);
//            merged.left = mergeTrees(t1.left, t2.left);
//            merged.right = mergeTrees(t1.right, t2.right);
//            return merged;
//        }
//    }

}
