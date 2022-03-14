package ��ָOFFER;

/**
 * @author lusir
 * @date 2021/11/19 - 10:27
 **/
public class offer_55_II {
    //    �Լ�������   �÷������ظ���������������   ��������
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return Math.abs(dfs(root.left) - dfs(root.right)) > 1 ? false : true && isBalanced(root.left) && isBalanced(root.right);

    }

    public int dfs(TreeNode node) {
        if (node == null) return 0;
        return Math.max(dfs(node.left) + 1, dfs(node.right) + 1);
    }
//    K���һ������   �ڶ�������һ��   ���ӽ�㿪ʼ����ÿһ���������  �����ظ�����
//    public boolean isBalanced(TreeNode root) {
//        return recur(root) != -1;
//    }
//
//    private int recur(TreeNode root) {
//        if (root == null) return 0;
//        int left = recur(root.left);
//        if(left == -1) return -1;
//        int right = recur(root.right);
//        if(right == -1) return -1;
//        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
//    }
//
}
