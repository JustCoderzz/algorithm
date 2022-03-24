package LeetcodeË¢Ìâ;

/**
 * @author lusir
 * @date 2022/3/24 - 13:30
 **/
public class _713 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<1) return 0;
        int i=0;
        int j=0;
        int sum=1;
        int count=0;
        while (j<nums.length){

            sum*=nums[j];
            while (sum>=k){
                sum/=nums[i];
                i++;
            }
            count+=j-i+1;
            j++;
        }
        return  count;
    }
}
