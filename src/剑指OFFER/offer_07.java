package ��ָOFFER;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2021/11/8 - 21:09
 **/
public class offer_07 {
//    ����K��Ľ��  �պ��ٿ�
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
        int i=dic.get(preorder[root]);//��ȡ�����ڵ���±�Ӷ��������������������ָ�����
        node.left=recur(root+1,left,i-1);//ÿһ�ε�root+1���ʵĶ����������ĸ��ڵ�
        node.right=recur(root+i-left+1,i+1,right);//���ʵ���root���ҽڵ�������� i-leftҲ�����������Ľ����
        return node;
    }
}
