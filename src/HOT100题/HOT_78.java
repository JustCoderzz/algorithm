package HOT100Ìâ;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lusir
 * @date 2021/11/5 - 8:38
 **/
public class HOT_78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();

        backtrack(res,list,nums,0);
        return  res;
    }
    public  void backtrack(List<List<Integer>> res,List<Integer> list,int[] nums,int startIndex){

        res.add(new ArrayList<>(list));
        for(int i=startIndex;i<nums.length;i++){
            list.add(nums[i]);
            backtrack(res,list,nums,i+1);
            list.remove(list.size()-1);

        }

    }
}
