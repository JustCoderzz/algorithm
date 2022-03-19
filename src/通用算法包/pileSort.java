package 通用算法包;

/**
 * @author lusir
 * @date 2022/3/6 - 22:44
 **/
public class pileSort {
    public static void main(String[] args) {
        int []num={49,38,65,97,76,13,27,49};
        sort(num,7);
        for(int i:num){
            System.out.println(i);
        }

    }

    public static void shift(int []nums,int low,int height){
        int i=low;
        int j=2*i+1;
        int tmp=nums[i];
        while (j<=height){
            if(j<height&&nums[j]<nums[j+1]){
                j++;
            }
            if(nums[j]>nums[i]){
                nums[i]=nums[j];
                i=j;
                j=2*i+1;
            }else break;
        }
        nums[i]=tmp;
    }

    public static void sort(int nums[],int n){

        int tmp;
        for(int j=n/2;j>=0;j--){
            shift(nums,j,n);
        }

        for(int j=n;j>=1;j--){
            tmp=nums[j];
            nums[j]=nums[0];
            nums[0]=tmp;
            shift(nums,0,j-1);
        }
    }

}
