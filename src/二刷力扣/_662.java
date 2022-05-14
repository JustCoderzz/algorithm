package 二刷力扣;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2022/5/2 - 19:34
 **/
public class _662 {
    int max=Integer.MIN_VALUE;
    Map<Integer,Integer> table=new HashMap<>();//记录每一层最左边节点的下标
    public int widthOfBinaryTree(TreeNode root) {
        solution(root,0,1);
        return max;
    }

    public void solution(TreeNode root,int index,int level) {
        if (root==null) return;
        solution(root.left,2*index+1,level+1);
        max=Math.max(max,table.computeIfAbsent(level, key -> index)-index);
        solution(root.right,2*index+2,level+1);
    }
}
