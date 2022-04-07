package Leetcode刷题;

import java.util.function.BinaryOperator;

/**
 * @author lusir
 * @date 2022/4/7 - 10:20
 **/
public class _410 {
//    我们选择的x是 我们每个分组的最大值  然后我们来看我们选择该x是否满足使得可以得到m个非空的连续子数组

    /**
     *
     * @param nums  分割的数组
     * @param m    分割的组数
     * @return     分割后和可得到的最小值
     */
    public int splitArray(int[] nums, int m) {
//          使用二分法确定上界和下界
//          x最大能够选择的就是 数组之和 也就是你能够任意得到你想要的分组
//          x的下界就是该数组中的最大值   可以使得 能够完成最基本的分组
        int sum=0;
        int max=0;
        for (int num:nums) {
            sum+=num;
            max=Math.max(num,max);
        }
        int L=max;
        int R=sum;
//        因为我们想要尽可能的得到最小值所以边界情况为  L<=R
        int res=0;
        while (L<=R) {
            int mid=(R-L)/2+L;
            if (check(nums,mid,m)) {
                R=mid-1;
                res=mid;
            }else{
                L=mid+1;
            }
        }
        return res;
    }

    /**
     *
     * @param nums   我们的分割数组
     * @param k      我们按照多大的数组和进行分割
     * @return      返回由当前k是否满足题目条件  能够顺利的分割完成m个组
     */

    boolean check(int nums[],int k,int m) {
        int sum=0;
        int count=1;
        for (int num:nums)  {
            sum+=num;
            if (sum>k) {
                sum=num;
                count++;
            }
        }
        if (count<=m) return  true;
        return  false;
    }

}
