package 面试题;

import java.util.Arrays;

/**
 * @author lusir
 * @date 2022/3/25 - 10:53
 **/
public class _小于n的最大数_字节 {
    public  int findMaxNum(int []nums ,int n) {
        char[] chars = (n + "").toCharArray();
        Arrays.sort(nums);//我们可以使用的数字数组
        int[]arr=new int[chars.length];
        for(int i=0;i<chars.length;i++) {
            arr[i]=chars[i]-'0';//我们需要对照得到的数字
        }
        StringBuilder sb=new StringBuilder();
        int j=0;
        for (int i=0;i<arr.length;i++) {
            int num=arr[i];
            while (j<nums.length) {
                if (j==nums.length-1&&num>nums[j]) {
                    int size=chars.length-sb.length();
                    for (int k=0;k<size;k++) {
                        sb.append(nums[nums.length-1]);
                    }
                    return Integer.parseInt(sb.toString());
                }
                if (nums[j]==num) {
                    sb.append(num);
                    j=0;
                    break;
                }else if (nums[j]<num) {
                    j++;
                }else {
                    while (j>=0&&nums[j]>num){
                        j--;
                    }
                    int size=0;
                    if (j<0) {
                        sb=new StringBuilder();
                        size=chars.length-1;
                    }else {
                        sb.append(nums[j]);
                        size=chars.length-sb.length();
                    }
                    for (int k=0;k<size;k++) {
                        sb.append(nums[nums.length-1]);
                    }
                    return Integer.parseInt(sb.toString());
                }
            }
        }
        return Integer.parseInt(sb.toString());
    }
}
