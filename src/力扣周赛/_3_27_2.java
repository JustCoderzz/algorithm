package Á¦¿ÛÖÜÈü;

/**
 * @author lusir
 * @date 2022/3/27 - 10:29
 **/
public class _3_27_2 {
    public int minDeletion(int[] nums) {
        int n=nums.length;
        int res=0;
        int i=0;

        while (i<n) {
            int j=i+1;
            while (j<n&&nums[i]==nums[j]){
                res++;
                j++;
            }
            i=j+1;
        }
        if ((n-res)%2!=0) res++;
        return res;
    }
}
