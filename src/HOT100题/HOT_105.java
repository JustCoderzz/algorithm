package HOT100Ã‚;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2021/12/1 - 16:29
 **/
public class HOT_105 {
    int []preorder;
    Map<Integer,Integer> dic=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder=preorder;
        for(int i=0;i<inorder.length;i++){
            dic.put(inorder[i],i);
        }
        return dfs(0,0,inorder.length-1);
    }

    public  TreeNode dfs(int root,int left,int right){
        if(left>right) return null;
        TreeNode node=new TreeNode(preorder[root]);
        int mid=dic.get(preorder[root]);
        node.left=dfs(root+1,left,mid-1);
        node.right=dfs(root+mid-left+1,mid+1,right);
        return node;
    }
}
