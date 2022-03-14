package ��������¼;

/**
 * @author lusir
 * @date 2021/12/6 - 12:06
 **/
public class Code_377 {
    public int combinationSum4(int[] nums, int target) {
//        dp[i]������Ǵճ�i��������
//        ��ȫ�����������������Ʒ���ڲ��������
//        ����������������  �ڲ������Ʒ
        int []dp=new int [target+1];
        dp[0]=1;
        for(int i=0;i<=target;i++){
            for(int j=0;j<nums.length;j++){
                if(i>=nums[j]){
                    dp[i]+=dp[i-nums[j]];
                }
            }
        }
        return dp[target];
    }
}
