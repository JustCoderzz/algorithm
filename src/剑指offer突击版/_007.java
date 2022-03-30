package ½£Ö¸offerÍ»»÷°æ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * @author lusir
 * @date 2022/3/29 - 10:18
 **/
public class _007 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        for (int i=0;i<nums.length;i++) {
            if (i!=0&&nums[i]==nums[i-1]) continue;
            int a=nums[i];
            int b=0;
            int c=0;
            int j=i+1;
            int k=nums.length-1;
            while (j<k&&(a+b)<=0) {
                 b=nums[j];
                 c=nums[k];
                 if ((a+b+c)==0) {
                     res.add(new ArrayList<Integer>(Arrays.asList(a,b,c)));
                    while (j<k&&nums[k]==nums[--k]);
                    while (j<k&&nums[j]==nums[++j]);
                 }else if ((a+b+c)>0) {
                     k--;
                 }else j++;
            }
        }
        return res;
    }
//    public void test(int nums[],int x,int y) {
//
//        int i=-1;
//        int j=0;
//        int flag=0;
//        while (j<nums.length) {
//            if (nums[j]>x&&nums[j]<y) {
//                if (flag==0) {
//                    i = j;
//                    flag=1;
//                }
//                j++;
//            }else if (i!=-1){
//                flag=0;
//                nums[i]=nums[j];
//                i++;
//                j++;
//            }
//        }
//    }
}
