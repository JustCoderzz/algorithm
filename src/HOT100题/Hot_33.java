package HOT100Ìâ;

/**
 * @author lusir
 * @date 2022/3/2 - 15:13
 **/
public class Hot_33 {
    public int search(int[] nums, int target) {
        int left=nums[0];
        int n=nums.length;
        int right=nums[n-1];
        if(left==target) return 0;
        if(right==target) return n-1;
        int i=0;
        int j=n-1;
        while(i<=j){
            int mid=(j-i)/2+i;
            if (nums[mid]==target){
                return mid;
            }else if (nums[mid]>left){
                if(target>left&&target<nums[mid]){
                    j=mid-1;
                }else{
                    i=mid+1;
                }
            }else{
                if (target>nums[mid]&&target<left){
                    i=mid+1;
                }else{
                    j=mid-1;
                }
            }

        }
        return -1;
    }
}
