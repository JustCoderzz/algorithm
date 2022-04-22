package LeetcodeÀ¢Ã‚;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lusir
 * @date 2022/4/22 - 23:16
 **/
public class _6 {
    public String convert(String s, int numRows) {

        List<StringBuilder> list=new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            list.add(new StringBuilder());
        }
        int index=0;
        int i=0;
        int sign=1;
        while (index<s.length()) {
            if (i==0){
                sign=1;
            }
            if (i==numRows-1){
                sign=-1;
            }
            list.get(i).append(s.charAt(index++));
            i+=sign;
        }
        StringBuilder res=new StringBuilder();
        for (int j = 0; j < numRows; j++) {
            res.append(list.get(j));
        }
        return res.toString();
    }
}
