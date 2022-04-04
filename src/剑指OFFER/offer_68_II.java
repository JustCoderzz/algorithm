package ½£Ö¸OFFER;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author lusir
 * @date 2022/4/4 - 21:42
 **/
public class offer_68_II {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Map<TreeNode,TreeNode> map=new HashMap<>();
        process(map,root);
        map.put(root,root);
        Set<TreeNode> set=new HashSet<>();

        TreeNode cur=p;
        set.add(cur);
        while (map.get(cur)!=cur){
            cur=map.get(cur);
            set.add(cur);
        }
        cur=q;
        set.add(cur);
        while (map.get(cur)!=cur){
            cur=map.get(cur);
            if (set.contains(cur)) return cur;
        }
        return root;

    }

    public void process(Map<TreeNode,TreeNode> map,TreeNode root) {
        if (root==null) return;
        if (root.left!=null) {
            map.put(root.left,root);
        }
        if (root.right!=null) {
            map.put(root.right,root);
        }
        process(map,root.left);
        process(map,root.right);
    }
}
