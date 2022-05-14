package 三刷力扣;

/**
 * @author lusir
 * @date 2022/5/7 - 0:43
 **/
public class _337 {
    public int rob(TreeNode root){
        RobBag robBag = robAt(root);
        return Math.max(robBag.stolen,robBag.no_stolen);
    }

    public RobBag robAt(TreeNode root) {
        RobBag robBag=new RobBag();
        if (root==null) return robBag;
        RobBag leftBag = robAt(root.left);
        RobBag rightBag = robAt(root.right);
//        偷根
        robBag.stolen=root.val;
        robBag.stolen+=leftBag.no_stolen;
        robBag.stolen+=rightBag.no_stolen;
//        不偷根
        robBag.no_stolen+=Math.max(leftBag.stolen,leftBag.no_stolen);
        robBag.no_stolen+=Math.max(rightBag.stolen,rightBag.no_stolen);
        return robBag;
    }

    class RobBag{
        int stolen;
        int no_stolen;
    }
}
