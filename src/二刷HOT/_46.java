package ¶şË¢HOT;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lusir
 * @date 2022/5/11 - 11:10
 **/
public class _46 {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> list=new ArrayList<>();
    boolean[] visited;
    public List<List<Integer>> permute(int[] nums) {
        visited=new boolean[nums.length];
        backTrace(nums);
        return res;
    }
    public void backTrace(int[] nums) {
        if (list.size()==nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]==true) continue;
            visited[i]=true;
            list.add(nums[i]);
            backTrace(nums);
            visited[i]=false;
            list.remove(list.size()-1);
        }
    }
}
