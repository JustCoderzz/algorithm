package LeetcodeÀ¢Ã‚;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author lusir
 * @date 2022/4/19 - 19:07
 **/
public class _821 {
    public int[] shortestToChar(String s, char c) {
        int[] res=new int[s.length()];
        Arrays.fill(res,Integer.MAX_VALUE);
        Deque<Integer> deque=new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==c) {
                res[i]=0;
                while (!deque.isEmpty()) {
                    int k=deque.pollFirst();
                    res[k]=Math.min(res[k],i-k);
                }
            }else if (!deque.isEmpty()&&s.charAt(deque.peek())==c){
                res[i]=Math.min(res[i],i-deque.peek());
            }
            deque.offer(i);
        }
        return res;
    }
}
