package 剑指OFFER;


import java.util.ArrayList;
import java.util.List;

/**
 * @author lusir
 * @date 2021/11/7 - 14:46
 **/
public class offer_34 {
    public List<List<Integer>> pathSum(TreeNode root, int target) {

        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        if(root==null) return res;
        int sum=0;
        backtrack(res,list,root,target,sum);
        return res;
    }

    public void backtrack(List<List<Integer>> res,List<Integer> list,TreeNode root,int target,int sum){
        if(root.left==null&&root.right==null){
            sum+=root.val;
            list.add(root.val);
            if(sum==target){
                res.add(new ArrayList<>(list));
                sum-=root.val;
                list.remove(list.size()-1);
                return;
            }
            sum-=root.val;
            list.remove(list.size()-1);
        }

            list.add(root.val);
            sum+=root.val;
            if(root.left!=null){
                backtrack(res,list,root.left,target,sum);
            }
            if(root.right!=null){
                backtrack(res,list,root.right,target,sum);
            }


            sum-=root.val;
            list.remove(list.size()-1);


    }
//    其他人的解答
//    class Solution {
//
//    private List<List<Integer>> res;
//
//    // 二叉树中和为某一值的路径
//    public List<List<Integer>> pathSum(TreeNode root, int sum) {
//        res = new ArrayList<>();
//        backtrack(root, sum, new ArrayList<>());
//        return res;
//    }
//
//    private void backtrack(TreeNode node, int target, List<Integer> collector) {
//        if (node == null) {
//            return;
//        }
//        collector.add(node.val);
//        target -= node.val;
//        if (target == 0 && node.left == null && node.right == null) {
//            res.add(new ArrayList<>(collector));
//        } else {
//            backtrack(node.left, target, collector);
//            backtrack(node.right, target, collector);
//        }
//        collector.remove(collector.size() - 1);
//    }
//}
}






  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }