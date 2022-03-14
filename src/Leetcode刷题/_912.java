package LeetcodeË¢Ìâ;

/**
 * @author lusir
 * @date 2022/3/13 - 13:40
 **/
public class _912 {
    public int[] sortArray(int[] nums) {
        quickSort(nums,0,nums.length-1);
        return nums;
    }

    public void quickSort(int []nums,int l,int r){
        if(l>r)  return;
        int key=nums[l];
        int i=l;
        int j=r;

            while(i<j){
                while(i<j&&nums[j]>=key) j--;
                if(i<j) {
                    nums[i]=nums[j];
                    i++;
                }
                while(i<j&&nums[i]<key) i++;
                if(i<j) {
                    nums[j]=nums[i];
                    j--;
                }
            }
            nums[i]=key;
            quickSort(nums,l,i-1);
            quickSort(nums,i+1,r);

    }
}
