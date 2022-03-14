package HOT100题;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author lusir
 * @date 2021/11/27 - 9:17
 **/
public class HOT_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
//        如果出现了某个数，那么就可以对该数字所对应的下标的数字进行处理，否则该下标位的数没有得到处理，则数组中不存在该数
        List<Integer> res=new ArrayList<>();

        for(int num:nums){
            int x=(num-1)%nums.length;
            nums[x]+=nums.length;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<nums.length+1){
                res.add(i+1);
            }
        }
        return res;
//        个人第一种做法  但是题目要求不适用额外空间
//        Set<Integer> set=new HashSet<>();
//        List<Integer> list=new ArrayList<>();
//        if(nums.length==0) return list;
//        for(int i=0;i<nums.length;i++){
//            set.add(nums[i]);
//        }
//        for(int i=1;i<=nums.length;i++){
//            if(!set.contains(i)){
//                list.add(i);
//            }
//        }
//        return list;
    }
}
