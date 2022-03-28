package 分享的题目;

/**
 * @author lusir
 * @date 2022/3/28 - 22:48
 **/

/**
 * 给定一个全是小写字母的字符串，如果字符串中相邻的两个字母相等或者在字母表中的位置相邻，那么他们两个可以贡献分数。
 * 其中'a'贡献1分，'b'贡献2分.....'z'贡献26分。每个字母只能使用一次。
 */
public class LargestScoreFromStr {
    public int solution(String str) {
//        dp[i]代表的是前i的字符串的最大分数
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
