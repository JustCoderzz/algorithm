package ��ˢHOT;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2022/5/9 - 19:15
 **/
public class _1 {
    public int[] twoSum(int[] nums, int target) {
//        ��¼ÿ������Ӧ���±�
        Map<Integer,Integer> table=new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
//            ����ҵ���Ϊtarget��ֱ�ӷ���  ����ͼ��뵽table��
            if (table.containsKey(target-nums[i])){
                return new int[]{table.get(target-nums[i]),i};
            }
            table.put(nums[i],i);
        }
//        ����Ҳ���  ��˵��û��
        return new int[]{-1,-1};
    }
}
