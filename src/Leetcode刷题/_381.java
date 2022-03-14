package LeetcodeÀ¢Ã‚;

import java.util.*;

/**
 * @author lusir
 * @date 2022/2/26 - 12:57
 **/
public class _381 {

    class RandomizedCollection {
        Map<Integer, Set<Integer>> dic;
        List<Integer> nums;
        public RandomizedCollection() {
            dic=new HashMap<>();
            nums=new ArrayList<>();
        }

        public boolean insert(int val) {
            nums.add(val);
            Set<Integer> set=dic.getOrDefault(val,new HashSet<Integer>());
            set.add(nums.size()-1);
            dic.put(val,set);
            return set.size()==1;

        }

        public boolean remove(int val) {
            if(!dic.containsKey(val)) return false;
            Iterator<Integer> it=dic.get(val).iterator();
            int i=it.next();
            int lastNum=nums.get(nums.size()-1);
            nums.set(i,lastNum);
            dic.get(val).remove(i);
            dic.get(lastNum).remove(nums.size()-1);
            if(i<nums.size()-1){
                dic.get(lastNum).add(i);
            }
            if(dic.get(val).size()==0){
                dic.remove(val);
            }
            nums.remove(nums.size()-1);
            return true;
        }

        public int getRandom() {
            return nums.get((int)(Math.random()*nums.size()));
        }
    }
}
