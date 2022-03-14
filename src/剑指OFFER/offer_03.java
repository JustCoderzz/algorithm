package 剑指OFFER;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author lusir
 * @date 2021/10/30 - 10:55
 **/
public class offer_03 {
    public int findRepeatNumber(int[] nums) {
//        时间复杂度高
//        Arrays.sort(nums);
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]==nums[i+1]){
//                return nums[i];
//            }
//        }
//        return 0;
//        官方解答
        Set<Integer> set=new HashSet<>();
        int repeat=-1;
        for (int num :
                nums) {
            if(!set.add(num)){
                repeat=num;
                break;
            }
        }
        return repeat;
    }
}
