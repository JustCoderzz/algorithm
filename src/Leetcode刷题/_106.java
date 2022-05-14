package Leetcodeˢ��;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2022/5/2 - 18:51
 **/
public class _106 {
    int[]postorder;
    Map<Integer,Integer> table;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.postorder=postorder;
//        ����ÿ����������ڵ������  ����ƽ��Ϊ������������
        Map<Integer,Integer> table=new HashMap<>();
        int n=inorder.length;
        for (int i = 0; i < n; i++) {
            table.put(inorder[i],i);
        }
        this.table=table;
//        ������� ������������  Ҳ����  ��  �� ��  �����������ȥ������
        return buildTree(n-1,0,n-1);
    }

    public TreeNode buildTree(int root,int left,int right) {
        if (left>right) return null;
        TreeNode node=new TreeNode(postorder[root]);
        int index=table.get(postorder[root]);
        node.right=buildTree(root-1,index+1,right);
        node.left=buildTree(root-right+index-1,left,index-1);
        return node;
    }
}
