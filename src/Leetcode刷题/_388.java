package LeetcodeË¢Ìâ;

import java.util.List;

/**
 * @author lusir
 * @date 2022/4/20 - 18:35
 **/
public class _388 {
    int index;
    int max;
    public int lengthLongestPath(String input) {
        String[] strList = input.split("\n");
        trace(strList,0,0);
        return max;
    }
    void trace(String[] strList,int level,int sum) {
        if (index>=strList.length) return;
        Result res;
        while (index<strList.length&&(res=compute(strList[index])).sum==level){
            index++;
            int count=sum+res.res.length();
            if (res.res.contains(".")){
                max=Math.max(max,count);
            }
            trace(strList,level+1,count+1);
        }
    }
    Result compute(String s) {
        Result res=new Result();
        int i = 0;
        for (; i < s.length(); i++) {
            if (s.charAt(i)!='\t') break;
        }
        res.sum=i;
        res.res=s.substring(i);
        return res;
    }
    class Result {
        int sum;
        String res;
    }


}
