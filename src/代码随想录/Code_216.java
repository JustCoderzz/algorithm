package ´úÂëËæÏëÂ¼;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lusir
 * @date 2021/12/16 - 9:35
 **/
public class Code_216 {
    public List<List<Integer>> combinationSum3(int k, int n) {

        List<Integer> list=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        backtrack(list,k,n,res,0,1);
        return res;
    }

    public void backtrack(List<Integer> list,int k,int n,List<List<Integer>> res,int sum,int start){
        if(sum>n){
            return;
        }
        if(list.size()==k){
            if (sum==n) res.add(new ArrayList<>(list));
            return;
        }
        for(int i=start;i<=9-(k-list.size())+1;i++){
            list.add(i);
            backtrack(list,k,n,res,sum+i,i+1);
            list.remove(list.size()-1);
        }
    }
}
