package HOT100Ã‚;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2022/2/23 - 19:59
 **/
public class Hot_581 {
    public int findUnsortedSubarray(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int right=-1;
        int left=-1;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
            }else{
                right=i;
            }
            if(nums[n-1-i]<min){
                min=nums[n-1-i];
            }else{
                left=n-1-i;
            }
        }
        return right==-1?0:right-left+1;
    }



}
