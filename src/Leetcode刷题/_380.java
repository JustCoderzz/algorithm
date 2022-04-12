package LeetcodeË¢Ìâ;

import java.util.*;

/**
 * @author lusir
 * @date 2022/4/13 - 0:02
 **/
public class _380 {
    class RandomizedSet {
        Map<Integer,Integer> map;
        List<Integer> list;
        Random random;

        public RandomizedSet() {
            map=new HashMap<>();
            list=new ArrayList<>();
            random=new Random();
        }

        public boolean insert(int val) {

            if (map.containsKey(val)) {
                return false;
            }
            list.add(val);
            map.put(val,list.size()-1);
            return true;
        }

        public boolean remove(int val) {
            if (map.containsKey(val)) {
                int index= map.get(val);;
                int v=list.get(list.size()-1);
                list.set(index,v);
                map.put(v,index);
                list.remove(list.size()-1);
                map.remove(val);
                return true;
            }
            return false;

        }

        public int getRandom() {
            return list.get(random.nextInt(list.size()));
        }
    }
}
