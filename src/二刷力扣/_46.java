package ¶şË¢Á¦¿Û;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lusir
 * @date 2022/3/3 - 20:25
 **/
public class _46 {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> list=new ArrayList<>();
    boolean [] used;
    public List<List<Integer>> permute(int [] nums){
        used=new boolean[nums.length];
        track(nums);
        return res;
    }
    public void track(int []nums){
        if(list.size()== nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;
            used[i]=true;
            list.add(nums[i]);
            track(nums);
            list.remove(list.size()-1);
            used[i]=false;
        }
    }
}
