package 二刷HOT;

/**
 * @author lusir
 * @date 2022/5/11 - 23:48
 **/
public class _75 {
    public void sortColors(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int index=-1;//标记的是1的头位置
        while (i<j) {
            while ((i<j)&&nums[i]<=1){
                if (nums[i]==1&&index==-1) index=i;
                if (nums[i]==0&&index!=-1) swap(nums,i,index++);
                i++;
            }
            if (i>=j) break;
            while (i<j&&nums[j]>1) j--;
            if (i>=j) break;
            swap(nums,i,j);
        }
        if (i==j&&nums[i]==0&&index!=-1) swap(nums,i,index++);
    }

    public  void swap(int[] nums,int i,int j) {
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }
}
