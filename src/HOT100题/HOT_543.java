package HOT100��;

/**
 * @author lusir
 * @date 2021/10/16 - 18:55
 **/
 class TreeNodeO {
      int val;
      TreeNodeO left;
      TreeNodeO right;
      TreeNodeO() {}
      TreeNodeO(int val) { this.val = val; }
      TreeNodeO(int val, TreeNodeO left, TreeNodeO right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class HOT_543 {
//     ���˵Ľⷨ
//     int count=0;
//    public int diameterOfBinaryTree(TreeNodeO root) {
//
//        dfs(root);
//        return count;
//    }
//    public int max(TreeNodeO root){
//        if(root==null){
//            return 0;
//        }
//        return Math.max(max(root.left)+1,max(root.right)+1);
//
//    }
//    public void dfs(TreeNodeO root){
//        if(root==null)return;
//        int left=max(root.left);
//        int right=max(root.right);
//        if(left+right>count){
//            count=left+right;
//        }
//        dfs(root.left);
//        dfs(root.right);
//    }


    class Solution {
        int ans;
        public int diameterOfBinaryTree(TreeNode root) {
            ans = 1;
            depth(root);
            return ans - 1;
        }
        public int depth(TreeNode node) {
            if (node == null) {
                return 0; // ���ʵ��սڵ��ˣ�����0
            }
            int L = depth(node.left); // �����Ϊ�������������
            int R = depth(node.right); // �Ҷ���Ϊ�������������
            ans = Math.max(ans, L+R+1); // ����d_node��L+R+1 ������ans
            return Math.max(L, R) + 1; // ���ظýڵ�Ϊ�������������
        }
    }

}
