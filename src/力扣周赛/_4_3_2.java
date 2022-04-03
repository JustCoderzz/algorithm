package Á¦¿ÛÖÜÈü;

import java.util.*;

/**
 * @author lusir
 * @date 2022/4/3 - 10:50
 **/
public class _4_3_2 {
    public List<List<Integer>> findWinners(int[][] matches) {
        int n=matches.length;
        Set<Integer> set=new HashSet<>();
        Map<Integer,Integer> map=new HashMap<>();
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        for (int i=0;i<n;i++) {
            set.add(matches[i][0]);
            set.add(matches[i][1]);
            map.put(matches[i][1],map.getOrDefault(matches[i][1],0)+1);
        }
        for (int i : set) {
            if (!map.containsKey(i)){
                list1.add(i);
            }else  if (map.get(i)==1){
                list2.add(i);
            }
        }
        Collections.sort(list1);
        Collections.sort(list2);
        res.add(list1);
        res.add(list2);
        return res;
    }
}
