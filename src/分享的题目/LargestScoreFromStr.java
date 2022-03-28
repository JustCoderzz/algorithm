package �������Ŀ;

/**
 * @author lusir
 * @date 2022/3/28 - 22:48
 **/

/**
 * ����һ��ȫ��Сд��ĸ���ַ���������ַ��������ڵ�������ĸ��Ȼ�������ĸ���е�λ�����ڣ���ô�����������Թ��׷�����
 * ����'a'����1�֣�'b'����2��.....'z'����26�֡�ÿ����ĸֻ��ʹ��һ�Ρ�
 */
public class LargestScoreFromStr {
    public int solution(String str) {
//        dp[i]�������ǰi���ַ�����������
        int []nums=new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            nums[i]=str.charAt(i)-'a';
        }
        int []dp=new int[str.length()];
        dp[0]=0;
        dp[1]=Math.abs(nums[1]-nums[0])==1?nums[0]+nums[1]:0;
        for (int i = 2; i < nums.length; i++) {
            if (Math.abs(nums[i]-nums[i-1])==1) {
                dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i-1]+nums[i]);
            }else dp[i]=dp[i-1];
        }
        return dp[str.length()-1];
    }
}
