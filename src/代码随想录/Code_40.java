package ´úÂëËæÏëÂ¼;

import java.util.*;

/**
 * @author lusir
 * @date 2021/12/16 - 10:12
 **/
public class Code_40 {
    int []candy;
    List<List<Integer>> res=new ArrayList<>();
    int target;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        this.candy=candidates;
        this.target=target;
        Arrays.sort(candy);
        List<Integer> list=new ArrayList<>();
        backtrace(list,0,0);
        return res;
    }

    public  void backtrace(List<Integer> list,int index,int sum){
        if(sum==target){
            res.add(new ArrayList<>(list));
            return;
        }
        if (sum>target) return;
        for(int i=index;i<candy.length&&sum+candy[i]<=target;i++){
            if(i>index&&candy[i]==candy[i-1]) continue;
            list.add(candy[i]);
            backtrace(list,i+1,sum+candy[i]);
            list.remove(list.size()-1);
        }
    }
}
