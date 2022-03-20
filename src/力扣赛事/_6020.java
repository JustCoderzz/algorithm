package Á¦¿ÛÈüÊÂ;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lusir
 * @date 2022/3/20 - 15:40
 **/
public class _6020 {
    public boolean divideArray(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key) % 2 != 0) return false;
        }
        return true;
    }
}
