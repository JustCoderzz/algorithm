package ¶þË¢Á¦¿Û;

import java.util.Collections;

/**
 * @author lusir
 * @date 2022/3/5 - 12:59
 **/
public class offer_03 {
    public  int findRepeatNumber(int []nums){
        int i=0;
        while(i<nums.length){
            if(nums[i]==i++) continue;
            if(nums[nums[i]]==nums[i]) return nums[i];
            int tmp=nums[i];
            nums[i]=nums[tmp];
            nums[tmp]=tmp;
        }
        return -1;
    }
}
