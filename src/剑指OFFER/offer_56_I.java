package 剑指OFFER;

import java.util.Arrays;

/**
 * @author lusir
 * @date 2021/11/18 - 10:57
 **/
public class offer_56_I {
    public int[] singleNumbers(int[] nums) {

        int res=0;
        int n=1;
        int x=0,y=0;
        for(int num:nums){
            res^=num;//得到了x^y
        }
        while((res&n)==0){
            n<<=1;//找到x和y异或结果为1的最低有效部分
        }
        for(int num:nums){
            if((num&n)==0)  x^=num;//通过该位进行分组
            else y^=num;
        }
        return new int[]{x,y};

//        个人做法
//        Arrays.sort(nums);
//        int []res=new int[2];
//        int j=0;
//        for(int i=0;i<nums.length-1;i++){
//            if(nums[i]==nums[i+1]){
//                i++;
//            }else {
//                res[j++]=nums[i];
//            }
//        }
//        if(res[1]==0){
//            res[1]=nums[nums.length-1];
//        }
//        return res;
    }
}
