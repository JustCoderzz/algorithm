package 二刷HOT;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lusir
 * @date 2022/5/11 - 10:21
 **/
public class _39 {

    /**
     *
     * @param candidates
     * @param target
     * @return
     * 我们使用回溯的方法  我们不断的从candidates数组中选择出数字进行组合   题目要求是没有重复元素的
     */
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> list=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backTrace(candidates,0,target,0);
        return res;
    }
    public void backTrace(int[] candidates,int index,int target,int sum) {
        if (sum>target) return;
        if (sum==target) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            list.add(candidates[i]);
            backTrace(candidates,i,target,sum+candidates[i]);
            list.remove(list.size()-1);
        }
    }
}
