package 通用算法包;

/**
 * @author lusir
 * @date 2022/5/5 - 16:25
 **/
public class InsertionSort {
    public  static  void  insertionSort(int nums[]) {
        int n=nums.length;
        if (nums==null||n<2) return;
        for (int i = 1; i < n; i++) {
            int j=i;
            while (j>=0&&nums[j]<nums[j-1]) {
                nums[j]=nums[j]^nums[j-1];
                nums[j-1]=nums[j]^nums[j-1];
                nums[j]=nums[j]^nums[j-1];
                j--;
            }
        }
    }
}
