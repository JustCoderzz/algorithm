package LeetcodeÀ¢Ã‚;

/**
 * @author lusir
 * @date 2022/3/11 - 14:39
 **/
public class _129 {
      public class TreeNode {
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

//    int sum=0;
    public int sumNumbers(TreeNode root) {

        return dfs(root,0);

//        return sum;
    }

//    public  void  backtrace(TreeNode root,StringBuilder sb){
//          if(root==null) return;
//          sb.append(root.val);
//          if(root.left==null&&root.right==null){
//              sum+=Integer.valueOf(sb.toString());
//              return;
//          }
//          if(root.left!=null){
//              backtrace(root.left,sb);
//              sb.deleteCharAt(sb.length()-1);
//          }
//          if(root.right!=null){
//              backtrace(root.right,sb);
//              sb.deleteCharAt(sb.length()-1);
//          }
//    }
    public  int dfs(TreeNode root,int sum){
        if(root==null)  return 0;
        sum=sum*10+root.val;
        if(root.left==null&&root.right==null){
            return sum;
        }else{
            return dfs(root.left,sum)+dfs(root.right,sum);
        }
    }
}
