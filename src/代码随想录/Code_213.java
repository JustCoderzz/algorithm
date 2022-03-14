package ��������¼;

/**
 * @author lusir
 * @date 2021/12/7 - 16:02
 **/
public class Code_213 {
    public int rob(int[] nums) {
//        �����л������ ���в�͵��һ�䷿�� �Ͳ�͵���һ�䷿��  �������
        if(nums==null||nums.length==0){
            return 0;
        }
        int n=nums.length;
        if(n==1) return nums[0];
        return Math.max(robAction(nums,0,n-1),robAction(nums,1,n));

    }
//    ��ҽ�����߼�
    int robAction(int[]nums,int start,int end){
        int x=0;//x,y,z�ֱ����洢��1��2��3����
        int y=0;
        int z=0;
        for(int i=start;i<end;i++){
            y=z;
            z=Math.max(y,x+nums[i]);
            x=y;
        }
        return z;
    }
}
