package Á¦¿ÛÖÜÈü;

/**
 * @author lusir
 * @date 2022/3/20 - 10:35
 **/
public class _1 {
    public int countHillValley(int[] nums) {
        int l=-1;
        int r=0;
        int count=0;
        while(r<nums.length){
            if(nums.length-1==r) break;

            while(r+1<nums.length&&nums[r+1]==nums[r]){
                r++;

            }
            if(l!=-1&&r+1<nums.length){
                if(nums[r]>nums[l]&&nums[r]>nums[r+1]) count++;
                if(nums[r]<nums[l]&&nums[r]<nums[r+1]) count++;
            }
            r++;
            l=r-1;
        }

        return count;
    }
}
