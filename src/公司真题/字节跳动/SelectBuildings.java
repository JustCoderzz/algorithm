package 公司真题.字节跳动;

/**
 * @author lusir
 * @date 2022/4/1 - 14:07
 **/
public class SelectBuildings {


    int sum=0;
    int start;
    public int solution(int nums[],int distance) {
//        nums中选择3个位置 需要满足两者之间的距离小于distance
        backTrace(nums,0,3,distance);
        return  sum;
    }

    /**
     *
     * @param nums
     * @param index
     * @param k
     * @param distance  最大距离
     */
    public void backTrace(int []nums,int index,int k,int distance) {
        if (index>=nums.length) return;
        if (k==0) {
            int l=nums[index]-nums[start];
            if (l<=distance) sum++;
            return;
        }
        for (int i=index;i<nums.length-k+1;i++) {
            if (k==3){
                start=i;
            }
            backTrace(nums,i+1,k-1,distance);
        }

    }
}
