package LeetcodeÀ¢Ã‚;

/**
 * @author lusir
 * @date 2022/3/24 - 14:54
 **/
public class _14 {
    public String longestCommonPrefix(String[] strs) {

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<strs[0].length();i++){
            sb.append(strs[0].charAt(i));
            for(String s:strs){
                if (!s.startsWith(sb.toString())) return sb.deleteCharAt(sb.length()-1).toString();
            }
        }
        return sb.toString();
    }
}
