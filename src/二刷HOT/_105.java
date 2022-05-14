package ¶þË¢HOT;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2022/5/13 - 19:47
 **/
public class _105 {
    int[] preorder;
    Map<Integer,Integer> table=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder=preorder;
        for (int i = 0; i < inorder.length; i++) {
            table.put(inorder[i],i);
        }
        return build(0,0,preorder.length-1);
    }

    public TreeNode build(int root,int L,int R) {
        if (L>R) return null;
        TreeNode node=new TreeNode(preorder[root]);
        int index=table.get(preorder[root]);
        node.left=build(root+1,L,index-1);
        node.right=build(root+index-L+1,index+1,R);
        return node;
    }
}
