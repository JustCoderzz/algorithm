package HOT100Ìâ;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lusir
 * @date 2021/11/4 - 15:18
 **/
public class HOT_39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        int sum=0;
        int n=candidates.length;
        backtrack(candidates,target,result,list,sum,0,n);
        return result;

    }

    public void backtrack(int[] cand,int target,List<List<Integer>> result,List<Integer> list,int sum,int startIndex,int length){
        if(sum==target){
            result.add(new ArrayList<>(list));
            return ;
        }
        if(sum>target){
            return;
        }
        for(int i=startIndex;i<length;i++){
            list.add(cand[i]);
            sum+=cand[i];
            backtrack(cand,target,result,list,sum,i,length);
            list.remove(list.size()-1);
            sum-=cand[i];
        }
    }
}
