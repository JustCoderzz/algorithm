package HOT100Ã‚;

import java.util.Arrays;

/**
 * @author lusir
 * @date 2021/10/29 - 8:18
 **/
public class HOT_287 {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if((nums[i]^nums[i+1])==0){
                return nums[i];
            }
        }
        return 0;
    }
}
