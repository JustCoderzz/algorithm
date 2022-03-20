package _360笔试;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author lusir
 * @date 2022/3/20 - 10:11
 **/
public class FindComplexPassword {
//给一串密码  判断它的复杂性   包括 长度大于8  必须有 大写字母   必须有小写字母   必须有特殊字符
    public boolean find(String s){
//        验证字符串中是否有特殊字符
        String regEx="[ _`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]|\n|\r|\t";
        Pattern p=Pattern.compile(regEx);
        Matcher m=p.matcher(s);
        return m.find();
    }
}
