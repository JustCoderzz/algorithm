package ��ˢ����;
import ��������¼.TreeNode;
/**
 * @author lusir
 * @date 2022/3/11 - 23:37
 **/
public class _26 {

    public  boolean isSubStructure(TreeNode A,TreeNode B){
//        ���ҵ���Ƚڵ� �ٽ��б���
        return (A!=null&&B!=null)&&(recur(A,B)||isSubStructure(A.left,B)||isSubStructure(A.right,B));
    }

//    �жϵ�ǰ����Ӧ�������Ƿ���A������
    public boolean recur(TreeNode A,TreeNode B){
        if(B==null) return true;
        if(A==null||A.val!=B.val) return  false;
        return  recur(A.left,B.left)&&recur(A.right,B.right);
    }
}
