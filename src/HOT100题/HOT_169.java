package HOT100��;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2021/11/4 - 9:25
 **/
public class HOT_169 {
    public int majorityElement(int[] nums) {

//        �Լ��Ľⷨ    1.��ϣ��
//        int n=nums.length;
//        int count=(int)Math.ceil(n/2);
//        Map<Integer,Integer> map=new HashMap<>();
//        for(int i=0;i<n;i++){
//            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
//        }
//        for(Map.Entry<Integer,Integer> entry:map.entrySet() ){
//            int key=entry.getKey();
//            int value=entry.getValue();
//            if(value>count){
//                return key;
//            }
//        }
//        return 0;

//        ����
//        class Solution {
//            public int majorityElement(int[] nums) {
//                Arrays.sort(nums);
//                return nums[nums.length / 2];
//            }
//        }

//        Boyer-Moore ͶƱ�㷨    ����
        int count=0;
        Integer candidate=null;
        for(int num:nums){
            if(count==0){
                candidate=num;
            }
            count+=(num==candidate)?1:-1;
        }
        return candidate;



    }
}
