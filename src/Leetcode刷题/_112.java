package LeetcodeË¢Ìâ;

import ´úÂëËæÏëÂ¼.TreeNode;

/**
 * @author lusir
 * @date 2022/4/5 - 10:35
 **/
public class _112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root==null) return false;
        if (root.left==null&&root.right==null&&root.val==targetSum) return true;
        return hasPathSum(root.left,targetSum-root.val)||hasPathSum(root.right,targetSum-root.val);
    }
}
