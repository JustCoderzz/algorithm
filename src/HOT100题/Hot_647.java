package HOT100题;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author lusir
 * @date 2021/11/28 - 10:53
 **/
public class Hot_647 {
    public int countSubstrings(String s) {
//        参考评论区大佬的做法  中心扩展方法
        int num=0;
        int size=s.length();
        for(int i=0;i<size;i++){
            for(int j=0;j<=1;j++){
                int l=i;
                int r=i+j;
                while(l>=0&&r<size&&s.charAt(l--)==s.charAt(r++)) num++;
            }
        }
        return num;
    }

}
