package ¶şË¢HOT;

/**
 * @author lusir
 * @date 2022/5/13 - 20:57
 **/
public class _136 {
    public int singleNumber(int[] nums) {
        int xor=0;
        for (int num :nums) {
            xor^=num;
        }
        return xor;
    }
}
