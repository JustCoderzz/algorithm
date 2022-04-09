package LeetcodeË¢Ìâ;

import ´úÂëËæÏëÂ¼.TreeNode;

import javax.activation.FileDataSource;

/**
 * @author lusir
 * @date 2022/4/9 - 18:28
 **/
public class _450 {

        public TreeNode deleteNode(TreeNode root, int key) {
            if (root==null) return null;
            if (key>root.val){
                root.right=deleteNode(root.right,key);
            }else if (key<root.val) {
                root.left=deleteNode(root.left,key);
            }else{
                if (root.left==null) return root.right;
                if (root.right==null) return root.left;
                TreeNode n=root.right;
                while (n.left!=null) {
                    n=n.left;
                }
                n.left=root.left;
                root=root.right;
            }
            return root;

        }


}
