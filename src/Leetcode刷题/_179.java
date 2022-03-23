package LeetcodeÀ¢Ã‚;


import java.util.Arrays;
import java.util.Comparator;


/**
 * @author lusir
 * @date 2022/3/21 - 22:22
 **/
public class _179 {
    public String largestNumber(int[] nums) {
        String[] strings=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            strings[i]=nums[i]+"";
        }
        Arrays.sort(strings,(a,b)->{
            String sa=a+b;
            String sb=b+a;
            return sb.compareTo(sa);
        });
        StringBuilder res=new StringBuilder();
        for (int i=0;i<nums.length;i++){
            res.append(strings[i]);
        }
        int len = res.length();
        int k = 0;
        while (k < len - 1 && res.charAt(k) == '0') k++;
        return res.substring(k);


    }
}
