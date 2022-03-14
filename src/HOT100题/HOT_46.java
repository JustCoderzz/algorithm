package HOT100Ìâ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author lusir
 * @date 2021/10/30 - 18:38
 **/
public class HOT_46 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        for(int num:nums){
            list.add(num);
        }
        int n=nums.length;
        backtrack(n,list,result,0);
        return result;

    }
    public  void backtrack(int n,List<Integer> list,List<List<Integer>> result,int first){
        if(first==n){
            result.add(new ArrayList<>(list));
        }
        for(int i=first;i<n;i++){
            Collections.swap(list,i,first);
            backtrack(n,list,result,first+1);
            Collections.swap(list,i,first);
        }
    }



}
