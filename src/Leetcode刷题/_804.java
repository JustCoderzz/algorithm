package LeetcodeÀ¢Ã‚;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lusir
 * @date 2022/4/10 - 0:24
 **/
public class _804 {
    String[] ss=new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set=new HashSet<>();
        for (String s:words) {
            StringBuilder sb=new StringBuilder();
            for (char c:s.toCharArray()) sb.append(ss[c-'a']);
            set.add(sb.toString());
        }
        return set.size();
    }
}
