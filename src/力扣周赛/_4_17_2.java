package Á¦¿ÛÖÜÈü;

import java.util.HashMap;
import java.util.Map;
import java.util.UnknownFormatConversionException;

/**
 * @author lusir
 * @date 2022/4/17 - 10:29
 **/
public class _4_17_2 {
    public int minimumRounds(int[] tasks) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < tasks.length; i++) {
            map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);
        }
        int res=0;
        for (Map.Entry<Integer,Integer> entry:map.entrySet()) {
            int v=entry.getValue();
            boolean flag=false;
            if (v%2==0) flag=true;
            if (v%3==0) {
                res+=v/3;
            }else if (v>3) {
                int tmp=v;
                int num=0;
                num+=tmp/3;
                tmp%=3;
                if (tmp%2==0){
                    num+=tmp/2;
                    res+=num;
                }else if (flag==false){
                    return -1;
                }else if (flag==true){
                    res+=v/2;
                }
            }
        }
        return res;
    }
}
