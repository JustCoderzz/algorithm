package ¶şË¢Á¦¿Û;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lusir
 * @date 2022/3/5 - 13:28
 **/
public class _448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res=new ArrayList<>();
        int i=0;
        while(i<nums.length){
            if (nums[i]==i+1){
                i++;
                continue;
            }
            int n=nums[i]-1;
            if(nums[i]==nums[n]){
                i++;
                continue;
            }
            int tmp=nums[n];
            nums[n]=nums[i];
            nums[i]=tmp;
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=(j+1)) res.add(j+1);
        }
        return res;

    }
}
