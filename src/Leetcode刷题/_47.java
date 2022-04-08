package LeetcodeË¢Ìâ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lusir
 * @date 2022/4/8 - 16:23
 **/
public class _47 {
    List<List<Integer>> res;
    List<Integer> list;
    boolean[]visited;
    public List<List<Integer>> permuteUnique(int[] nums) {

        Arrays.sort(nums);
        res=new ArrayList<>();
        list=new ArrayList<>();
        visited=new boolean[nums.length];
        trace(nums);
        return  res;
    }

    public void trace(int []nums) {
        if (list.size()==nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        int []arr=new int[21];
        for (int i=0;i<nums.length;i++) {
            if (arr[10+nums[i]]!=0||visited[i]) continue;
            arr[10+nums[i]]=1;
            list.add(nums[i]);
            visited[i]=true;
            trace(nums);
            visited[i]=false;
            list.remove(list.size()-1);
        }
    }

}
