package LeetcodeË¢Ìâ;

/**
 * @author lusir
 * @date 2022/3/24 - 10:05
 **/
public class _283 {
    public  void moveZeroes(int nums[]){

        int start=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) {
                start=i;
                break;
            }
        }
        int j=start+1;
        while(j<nums.length){
            if(nums[j]!=0) {
                nums[start++]=nums[j++];
            }else {
                j++;
            }

        }
        for(int i=nums.length-1;i>=start;i--){
            nums[i]=0;
        }
    }
}
