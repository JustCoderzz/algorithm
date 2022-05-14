package ��ˢHOT;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2022/5/13 - 20:40
 **/
public class _128 {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Integer> table=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            table.put(nums[i],1);
        }
        int res=Integer.MIN_VALUE;
        for (int num:nums) {
            if (!table.containsKey(num-1)) {
//                Ϊ��ȥ��  ��Ϊ���ܻ���ֺܶ���С��ֵ�����
                int right=table.get(num);
                while (table.containsKey(right+1)){
                    right=right+1;
                }
                table.put(num,right);
                res=Math.max(res,right-num+1);
            }
        }
        return res;
    }
}
