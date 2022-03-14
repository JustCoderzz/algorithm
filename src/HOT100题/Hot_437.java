package HOT100Ã‚;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2022/3/1 - 18:33
 **/
public class Hot_437 {
    public  int pathSum(TreeNode root,int targetSum){
        Map<Long,Integer> dic=new HashMap<>();
        dic.put(0l,1);
        return dfs(dic,targetSum,root,0);
    }

    public  int dfs(Map<Long,Integer> dic,int target,TreeNode root,long cur){
        if(root==null) return 0;
        int res=0;
        cur+=root.val;

        res=dic.getOrDefault(cur-target,0);
        dic.put(cur,dic.getOrDefault(cur,0)+1);
        res+=dfs(dic,target,root.left,cur);
        res+=dfs(dic,target,root.right,cur);
        dic.put(cur,dic.getOrDefault(cur,0)-1);
        return res;

    }
}
