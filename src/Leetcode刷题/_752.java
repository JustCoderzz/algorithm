package LeetcodeË¢Ìâ;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lusir
 * @date 2022/4/14 - 19:06
 **/
public class _752 {
    public int openLock(String[] deadends, String target) {

        Set<Integer> set=new HashSet<>();
        for (String str:deadends) {
            set.add(Integer.parseInt(str));
        }
        int minOperation=Integer.MAX_VALUE;
        int num=Integer.parseInt(target);
        int [] arr=new int[]{1,-1,10,-10,100,-100,1000,-1000};

    }
}
