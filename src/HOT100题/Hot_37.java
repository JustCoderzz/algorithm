package HOT100Ã‚;

/**
 * @author lusir
 * @date 2022/2/23 - 22:59
 **/
public class Hot_37 {
    int res=0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;
        backTracking(root,targetSum,0);
        return  res;
    }

    public  void  backTracking(TreeNode root ,int target,int cur){
        if (root==null) return;
        int num=root.val+cur;
        if (num==target) {
            res++;
        }
        backTracking(root.left,target,num);
        backTracking(root.right,target,num);
        backTracking(root.left,target,0);
        backTracking(root.right,target,0);
    }
}
