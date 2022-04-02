package Á¦¿ÛÖÜÈü;

/**
 * @author lusir
 * @date 2022/4/2 - 22:44
 **/
public class _4_2_2 {
    public int triangularSum(int[] nums) {

        int n=nums.length;
        for (int i=n-1;i>=0;i--) {
            for (int j=0;j<i;j++) {
                nums[j]=(nums[j]+nums[j+1])%10;
            }
        }
        return nums[0];
    }
}
