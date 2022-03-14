package ´úÂëËæÏëÂ¼;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lusir
 * @date 2022/3/9 - 16:11
 **/
public class code_491 {
    int []nums;
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        this.nums=nums;
        List<Integer> list=new ArrayList<>();

        trace(list,0);

        return res;
    }


    public  void trace(List<Integer> list,int index){

        if(list.size()>1){
            res.add(new ArrayList<>(list));
        }
        int used[]=new int[201];
        for(int i=index;i<nums.length;i++){
            if(!list.isEmpty()&&nums[i]<list.get(list.size()-1)||used[nums[i]+100]==1){
                continue;
            }
            used[nums[i]+100]=1;
            list.add(nums[i]);
            trace(list,i+1);
            list.remove(list.size()-1);
        }
    }
}
