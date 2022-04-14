package ÈýË¢Á¦¿Û;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2022/4/13 - 23:56
 **/
public class _07 {

    Map<Integer,Integer> map=new HashMap<>();
    int[] pre;
    public  TreeNode buildTree(int[] pre,int[] order) {
        this.pre=pre;
        for (int i = 0; i < order.length; i++) {
            map.put(order[i],i);
        }
        return build(0,0,pre.length-1);
    }

    public TreeNode build(int root,int left,int right) {
        if (left>right) return null;
        TreeNode node=new TreeNode(pre[root]);
        int mid=map.get(pre[root]);
        node.left=build(root+1,left,mid-1);
        node.right=build(root+mid-left+1,mid+1,right);
        return node;
    }
}
