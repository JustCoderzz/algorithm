package LeetcodeË¢Ìâ;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lusir
 * @date 2021/11/4 - 14:40
 **/
public class _77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();

        backtrack(res,list,k,1,n);
        return  res;
    }

    public  void  backtrack(List<List<Integer>> res,List<Integer> list,int k,int first,int n){
        if(list.size()==k){
            res.add(new ArrayList<>(list));
            return ;
        }
        for(int i=first;i<=n;i++){
            list.add(i);
            backtrack(res,list,k,i+1,n);

            list.remove(list.size()-1);
        }
    }
}
