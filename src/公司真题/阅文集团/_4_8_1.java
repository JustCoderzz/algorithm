package 公司真题.阅文集团;

/**
 * @author lusir
 * @date 2022/4/8 - 21:07
 **/
public class _4_8_1 {

    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    public boolean isSubtree (TreeNode s, TreeNode t) {
        if (t==null) return true;
        if (s==null) return false;
        if (s.val==t.val) {
            return dfs(s,t);
        }else {
            return  isSubtree(s.left,t)||isSubtree(s.right,t);
        }

    }

    public boolean dfs(TreeNode s,TreeNode t) {
        if (s==null&&t==null) return true;
        if (s==null||t==null) return false;
        if (s.val!=t.val) return false;
        return dfs(s.left,t.left)&&dfs(s.right,t.right);
    }
}
