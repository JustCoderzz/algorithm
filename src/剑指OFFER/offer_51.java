package 剑指OFFER;

/**
 * @author lusir
 * @date 2022/3/26 - 12:12
 **/
public class offer_51 {
    public int reversePairs(int[] nums) {

        return mergeSort(nums,0,nums.length-1);
    }

    public  int mergeSort(int []nums,int left,int right) {
        if (left>=right) return 0;
        int mid=(left+right)>>1;
        int l=mergeSort(nums,left,mid);
        int r=mergeSort(nums,mid+1,right);

        int j=left;
        int k=mid+1;
        int both=0;
        int i=0;
        int []tmp=new int[right-left+1];
        while (j<=mid&&k<=right) {

            if (nums[j]<=nums[k]) {
                tmp[i++]=nums[j++];
            }else {
                tmp[i++]=nums[k++];
                both+=mid-j+1;
            }
        }
        while (j<=mid) tmp[i++]=nums[j++];
        while (k<=right) tmp[i++]=nums[k++];
//        不能在原数组上进行修改  负责会覆盖掉数据
        for(int p=left,q=0;p<=right;p++,q++) {
            nums[p]=tmp[q];
        }
        return l+r+both;
    }
}
