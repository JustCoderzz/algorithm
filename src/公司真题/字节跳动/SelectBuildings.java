package ��˾����.�ֽ�����;

/**
 * @author lusir
 * @date 2022/4/1 - 14:07
 **/
public class SelectBuildings {



    public int solution(int nums[],int distance) {
//        nums��ѡ��3��λ�� ��Ҫ��������֮��ľ���С��distance
        long sum=0;
        for (int i = 0,j=i+2; i < nums.length - 2; i++) {
            long gap=0;
            while (j<nums.length&&(nums[j]-nums[i])<=distance){
                j++;
            }
            gap=j-i-1;
            sum=(sum+(gap*(gap-1))/2)%99997867;
        }
        return (int) sum;
    }


}
