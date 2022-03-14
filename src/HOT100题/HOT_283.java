package HOT100题;

/**
 * @author lusir
 * @date 2021/10/27 - 13:51
 **/
public class HOT_283 {
    public void moveZeroes(int[] nums) {
//双指针  快慢指针
        int i=0;
        int j=0;
        for(;j<nums.length;j++){
            if(nums[j]!=0){

                nums[i++]=nums[j];
            }
        }
        for( ;i<nums.length;i++){
            nums[i]=0;
        }
    }
}
