package ´úÂëËæÏëÂ¼;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lusir
 * @date 2021/12/16 - 10:12
 **/
public class Code_40 {
    int []cand;
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        this.cand=candidates;
        List<Integer> list=new ArrayList<>();
        backtrace(list,0);

    }

    public  void backtrace(List<Integer> list,int index){
    }
}
