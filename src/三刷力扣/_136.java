package ÈıË¢Á¦¿Û;

/**
 * @author lusir
 * @date 2022/4/27 - 20:32
 **/
public class _136 {
    public int singleNumber(int[] nums) {
        int res=nums[0];
        for (int i = 1; i < nums.length; i++) {
            res^=nums[i];
        }
        return res;
    }
}
