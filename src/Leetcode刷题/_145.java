package LeetcodeË¢Ìâ;

import ´úÂëËæÏëÂ¼.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lusir
 * @date 2022/4/15 - 9:52
 **/
public class _145 {
    List<Integer> res=new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        dfs(root);
        return res;
    }
    public void dfs(TreeNode root) {
        if (root==null) return;
        dfs(root.left);
        dfs(root.right);
        res.add(root.val);
    }
}
