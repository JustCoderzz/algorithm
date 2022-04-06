package 公司真题.腾讯音乐互娱;

/**
 * @author lusir
 * @date 2022/4/6 - 14:50
 **/
public class _4_6_2 {


    public int maxValue (String s, int k) {
        int maxValue=-1;
        for (int i=0;i<s.length()-k;i++) {
            maxValue=Math.max(maxValue,Integer.parseInt(s.substring(i,i+k)));
        }
        return maxValue;
    }
}
