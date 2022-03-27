package Á¦¿ÛÖÜÈü;

import java.util.*;

/**
 * @author lusir
 * @date 2022/3/27 - 10:29
 **/
public class _3_27_1 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for(int i:nums1) {
            set1.add(i);
        }
        for(int i:nums2) {
            set2.add(i);
        }
        List<Integer> list1=new ArrayList<>();
        for(int i:nums1) {
            if (!set2.contains(i)) {
                if (!list1.contains(i)) list1.add(i);

            }
        }
        List<Integer> list2=new ArrayList<>();
        for(int i:nums2) {
            if (!set1.contains(i)) {
                if (!list2.contains(i)) list2.add(i);

            }
        }
        List<List<Integer>> res=new ArrayList<>();
        res.add(list1);
        res.add(list2);
        return res;
    }
}
