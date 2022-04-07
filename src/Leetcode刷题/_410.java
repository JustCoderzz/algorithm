package Leetcodeˢ��;

import java.util.function.BinaryOperator;

/**
 * @author lusir
 * @date 2022/4/7 - 10:20
 **/
public class _410 {
//    ����ѡ���x�� ����ÿ����������ֵ  Ȼ��������������ѡ���x�Ƿ�����ʹ�ÿ��Եõ�m���ǿյ�����������

    /**
     *
     * @param nums  �ָ������
     * @param m    �ָ������
     * @return     �ָ��Ϳɵõ�����Сֵ
     */
    public int splitArray(int[] nums, int m) {
//          ʹ�ö��ַ�ȷ���Ͻ���½�
//          x����ܹ�ѡ��ľ��� ����֮�� Ҳ�������ܹ�����õ�����Ҫ�ķ���
//          x���½���Ǹ������е����ֵ   ����ʹ�� �ܹ����������ķ���
        int sum=0;
        int max=0;
        for (int num:nums) {
            sum+=num;
            max=Math.max(num,max);
        }
        int L=max;
        int R=sum;
//        ��Ϊ������Ҫ�����ܵĵõ���Сֵ���Ա߽����Ϊ  L<=R
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
     * @param nums   ���ǵķָ�����
     * @param k      ���ǰ��ն�������ͽ��зָ�
     * @return      �����ɵ�ǰk�Ƿ�������Ŀ����  �ܹ�˳���ķָ����m����
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
