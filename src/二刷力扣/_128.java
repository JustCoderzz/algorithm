package ¶şË¢Á¦¿Û;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lusir
 * @date 2022/3/22 - 10:14
 **/
public class _128 {
    public  int     longestConsecutive(int nums[]){
        Set<Integer> set=new HashSet<>();
        int res=0;
        for(int item:nums){
            set.add(item);
        }
        for(int i:nums){
            if(!set.contains(i-1)){
                int num=1;
                while(set.contains(i+1)){
                    num++;
                    i=i+1;
                }
                res=Math.max(num,res);
            }
        }
        return res;
    }
}
