package HOT100Ã‚;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lusir
 * @date 2021/11/29 - 19:15
 **/
public class HOT_98 {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode node, long lower, long upper) {
        if (node == null) {
            return true;
        }
        if (node.val <= lower || node.val >= upper) {
            return false;
        }
        return isValidBST(node.left, lower, node.val) && isValidBST(node.right, node.val, upper);
    }

//    ∏¥‘”÷––Ú±È¿˙
//    List<Integer> list=new ArrayList<>();
//    public boolean isValidBST(TreeNode root) {
//
//        dfs(root);
//        for(int i=0;i<list.size()-1;i++){
//            if (list.get(i)>=list.get(i+1)){
//                return false;
//            }
//        }
//        return true;
//
//    }
//    public  void dfs(TreeNode root){
//        if(root==null) return;
//        dfs(root.left);
//        list.add(root.val);
//        dfs(root.right);
//
//    }
}
