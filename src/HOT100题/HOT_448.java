package HOT100��;

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
//        ���������ĳ��������ô�Ϳ��ԶԸ���������Ӧ���±�����ֽ��д���������±�λ����û�еõ������������в����ڸ���
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
//        ���˵�һ������  ������ĿҪ�����ö���ռ�
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
