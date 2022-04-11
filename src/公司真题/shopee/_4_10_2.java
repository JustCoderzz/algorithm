package 公司真题.shopee;

/**
 * @author lusir
 * @date 2022/4/10 - 22:13
 **/
public class _4_10_2 {
//    替换字符串中的数字成"num"，如果数字相连,则相连数字一起替换成"num"。
//
//数字指0123456789
//
//如："abvhjb123ddd" 替换成 "abvhjbnumddd"
//                         abvhjbnumddd
//如："abvhjb1y3ddd" 替换成 "abvhjbnumynumddd"
//                         abvhjbnumynumddd
    public String replaceStr (String s) {

        char[] chars = s.toCharArray();
        StringBuilder sb=new StringBuilder();
        int j=0;
        while (j<chars.length) {
            boolean flag=false;
            while (j<chars.length&&Character.isDigit(chars[j])){
                j++;
                flag=true;
            }
            if (flag) sb.append("num");
            if (j<chars.length){
                sb.append(chars[j++]);
            }
        }
        return sb.toString();

    }
}
