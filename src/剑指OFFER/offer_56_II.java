package 剑指OFFER;

/**
 * @author lusir
 * @date 2021/11/19 - 8:52
 **/
public class offer_56_II {
    public int singleNumber(int[] nums) {
        int ones=0,twos=0;
        for(int num:nums){
            ones=ones^num&~twos;//输入num为0状态不变，输入num为1，ones变成~ones  若two为1的话  one只能为0  因为状态最高为10
//            对每一位进行操作，最终Ones上只能为1或者0，返回的值也取决于ones
            twos=twos^num&~ones;
//           若one为1的话two只能为0   one为0的时候  根据Num来判断two的状态
        }
        return  ones;
    }
}
