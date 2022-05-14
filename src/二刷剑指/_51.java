package ¶şË¢½£Ö¸;

/**
 * @author lusir
 * @date 2022/5/8 - 14:58
 **/
public class _51 {
    public  int reversePairs(int nums[]) {
        return  sort(nums,0,nums.length-1);
    }

    public  int sort(int[] nums,int L,int R){
        if (L>=R) return 0;
        int M=(R-L)>>1+L;
        return sort(nums,L,M)+sort(nums,M+1,R)+merge(nums,L,M,R);
    }

    public  int  merge(int[] nums,int L,int M,int R) {
        int[] help=new int[R-L+1];
        int count=0;
        int i=0;
        int p1=L;
        int p2=M+1;
        while (p1<=M&&p2<=R) {
            count+=nums[p1]>nums[p2]?M-p1+1:0;
            help[i++]=nums[p1]<=nums[p2]?nums[p1++]:nums[p2++];
        }
        while (p1<=M) {
            help[i++]=nums[p1++];
        }
        while (p2<=R) {
            help[i++]=nums[p2++];
        }
        for (int j = 0; j < help.length; j++) {
            nums[L+j]=help[j];
        }
        return count;
    }
}
