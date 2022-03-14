package HOT100Ìâ;

/**
 * @author lusir
 * @date 2021/11/30 - 9:05
 **/
public class HOT_34 {
    public int[] searchRange(int[] nums, int target) {

        int index=douFind(nums,target,0,nums.length-1);
        int start=index;
        int end=index;
        while(start-1>=0&&nums[start-1]==target){
            start--;
        }
        while (end+1<nums.length&&nums[end+1]==target){
            end++;
        }
        return new int[]{start,end};

    }
    public int douFind(int []nums,int target,int left,int right){
        int index=-1;

        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]<target){
                left=mid+1;
            }else if(nums[mid]>target){
                right=mid-1;
            }else{
                index=mid;
                break;
            }
        }
        return index;
    }
}
