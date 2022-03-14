package 剑指OFFER;

/**
 * @author lusir
 * @date 2021/11/17 - 16:35
 **/
public class offer_26 {
//    K神的解答
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return (A != null && B != null) && (recur(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B));
    }
    boolean recur(TreeNode A, TreeNode B) {
        if(B == null) return true;
        if(A == null || A.val != B.val) return false;
        return recur(A.left, B.left) && recur(A.right, B.right);
    }

}



//        个人解答
//        if (B == null) return false;
//        if (A == null) return false;
//        if (A.val == B.val) {
//            if(dfs(A.left, B.left) && dfs(A.right, B.right)){
//                return  true;
//            }else{
//                return isSubStructure(A.left, B) || isSubStructure(A.right, B);
//            }
//        } else {
//
//            return isSubStructure(A.left, B) || isSubStructure(A.right, B);
//
//        }
//
//    }
//
//    public boolean dfs(TreeNode A, TreeNode B) {
//        if (B == null) {
//            return true;
//        }
//        if(A==null&&B!=null){
//            return false;
//        }
//        if(A.val!=B.val){
//            return false;
//        }
//        return dfs(A.left,B.left)&&dfs(A.right,B.right);
//    }

