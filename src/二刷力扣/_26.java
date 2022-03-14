package 二刷力扣;
import 代码随想录.TreeNode;
/**
 * @author lusir
 * @date 2022/3/11 - 23:37
 **/
public class _26 {

    public  boolean isSubStructure(TreeNode A,TreeNode B){
//        先找到相等节点 再进行遍历
        return (A!=null&&B!=null)&&(recur(A,B)||isSubStructure(A.left,B)||isSubStructure(A.right,B));
    }

//    判断当前根对应的字数是否是A的子树
    public boolean recur(TreeNode A,TreeNode B){
        if(B==null) return true;
        if(A==null||A.val!=B.val) return  false;
        return  recur(A.left,B.left)&&recur(A.right,B.right);
    }
}
