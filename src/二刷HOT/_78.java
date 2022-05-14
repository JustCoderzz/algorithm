package ¶şË¢HOT;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lusir
 * @date 2022/5/12 - 20:07
 **/
public class _78 {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> list=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backTrace(nums,0);
        return res;
    }

    public void backTrace(int[] nums,int index) {
        if (index>=nums.length) return;
        res.add(new ArrayList<>(list));

        for (int i = index; i < nums.length; i++) {
            list.add(nums[i]);
            backTrace(nums,i+1);
            list.remove(list.size()-1);
        }
    }
}
