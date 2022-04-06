package 公司真题.腾讯音乐互娱;

/**
 * @author lusir
 * @date 2022/4/6 - 20:09
 **/
public class _4_6_5 {
    public String maxLexicographical (String num) {

        char[] str = num.toCharArray();
        // 找到第一个0
        int idx = 0;
        while(idx < str.length && str[idx] != '0') idx++;
        // 把从这个0开始的连续0全部变为1
        while(idx < str.length && str[idx] == '0') str[idx++] = '1';
        return new String(str);
    }
}
