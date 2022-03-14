package HOT100��;

import HOT100��.TreeNode;

/**
 * @author lusir
 * @date 2021/10/27 - 13:10
 **/
public class HOT_617 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
//        1.�ж���������Ƿ�Ϊ�գ������Ϊ�գ��򲻲���
//        2.������Ϊ�գ�����ֵ���
//        3.������һ��Ϊ�գ���Ϊ����һ����ֵ
//        4.��root1��Ϊ��������

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
//    �ٷ��ⷨ
//    class Solution {
//        public HOT100��.TreeNode mergeTrees(HOT100��.TreeNode t1, HOT100��.TreeNode t2) {
//            if (t1 == null) {
//                return t2;
//            }
//            if (t2 == null) {
//                return t1;
//            }
//            HOT100��.TreeNode merged = new HOT100��.TreeNode(t1.val + t2.val);
//            merged.left = mergeTrees(t1.left, t2.left);
//            merged.right = mergeTrees(t1.right, t2.right);
//            return merged;
//        }
//    }

}
