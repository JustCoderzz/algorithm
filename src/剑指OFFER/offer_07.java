package 剑指OFFER;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2021/11/8 - 21:09
 **/
public class offer_07 {
//    又是K神的解答  日后再看
    int []preorder;
    Map<Integer,Integer> dic=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder=preorder;
        for(int i=0;i<inorder.length;i++){
            dic.put(inorder[i],i);
        }
        return recur(0,0,inorder.length-1);
    }

    public TreeNode recur(int root,int left,int right){
        if(left>right) return null;
        TreeNode node=new TreeNode(preorder[root]);
        int i=dic.get(preorder[root]);//获取到根节点的下标从而将中序数组左右子树分隔开来
        node.left=recur(root+1,left,i-1);//每一次的root+1访问的都是左子树的根节点
        node.right=recur(root+i-left+1,i+1,right);//访问的是root的右节点的右子树 i-left也就是左子树的结点数
        return node;
    }
}
