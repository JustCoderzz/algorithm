package ��ָOFFER;

/**
 * @author lusir
 * @date 2021/11/19 - 8:52
 **/
public class offer_56_II {
    public int singleNumber(int[] nums) {
        int ones=0,twos=0;
        for(int num:nums){
            ones=ones^num&~twos;//����numΪ0״̬���䣬����numΪ1��ones���~ones  ��twoΪ1�Ļ�  oneֻ��Ϊ0  ��Ϊ״̬���Ϊ10
//            ��ÿһλ���в���������Ones��ֻ��Ϊ1����0�����ص�ֵҲȡ����ones
            twos=twos^num&~ones;
//           ��oneΪ1�Ļ�twoֻ��Ϊ0   oneΪ0��ʱ��  ����Num���ж�two��״̬
        }
        return  ones;
    }
}
