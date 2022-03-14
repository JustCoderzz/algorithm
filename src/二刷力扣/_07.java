package 二刷力扣;

import 代码随想录.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2022/3/5 - 15:41
 **/
public class _07 {
    Map<Integer,Integer> map=new HashMap<>();
    int []pre;
    public TreeNode buildTree(int pre[],int[]order){
        for(int i=0;i<order.length;i++){
            map.put(order[i],i);
        }
        this.pre=pre;
        return  build(0,0,order.length-1);
    }


    public TreeNode build(int root,int left,int right){
        if(left>right) return null;
        int num=pre[root];
        TreeNode node=new TreeNode(num);
        int index=map.get(num);
        node.left=build(root+1,left,index-1);
        node.right=build(root+index-left+1,index+1,right);
        return node;

    }
}
