package 左神算法题目;

/**
 * @author lusir
 * @date 2022/5/8 - 14:39
 **/
public class MinSum_p4 {

    public int getMinSum(int nums[]){
        return sort(nums,0,nums.length-1);
    }


    public  int sort(int nums[],int left,int right){
        if (right==left) return 0;
        int mid=(right-left)>>1+left;
        return sort(nums,0,mid)+
                sort(nums,mid+1,right)+
                merge(nums,left,mid,right);
    }

    public  int merge(int nums[],int left,int mid,int right){
        int[]help=new int[right-left+1];
        int sum=0;
        int p1=left;
        int p2=mid+1;
        int i=0;
        while (p1<=mid&&p2<=right) {
            if (nums[p1]<nums[p2]){
                sum+=(right-p2+1)*nums[p1];
            }
            help[i++]=nums[p1]<nums[p2]?nums[p1++]:nums[p2++];
        }
        while (p1<=mid){
            help[i++]=nums[p1++];
        }
        while (p2<=right){
            help[i++]=nums[p2++];
        }
        for (int j = 0; j < help.length; j++) {
            nums[left+j]=help[j];
        }
        return sum;
    }
}
