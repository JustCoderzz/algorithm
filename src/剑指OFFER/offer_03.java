package ��ָOFFER;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author lusir
 * @date 2021/10/30 - 10:55
 **/
public class offer_03 {
    public int findRepeatNumber(int[] nums) {
//        ʱ�临�Ӷȸ�
//        Arrays.sort(nums);
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]==nums[i+1]){
//                return nums[i];
//            }
//        }
//        return 0;
//        �ٷ����
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
