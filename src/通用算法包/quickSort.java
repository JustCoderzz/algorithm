package 通用算法包;

/**
 * @author lusir
 * @date 2022/3/6 - 23:44
 **/
public class quickSort {
    public  void sort(int []nums,int left,int right){
        int key=nums[left];
        int i=left;
        int j=right;
        if(i<j) {
            while (i < j) {
                while (i < j && nums[j] > key) j--;
                if (i < j) {
                    nums[i] = nums[j];
                    i++;
                }
                while (i < j && nums[i] < key) i++;
                if (i < j) {
                    nums[j] = nums[i];
                    j--;
                }
            }
            nums[i] = key;
            sort(nums, left, i - 1);
            sort(nums, j + 1, right);
        }
    }
}
