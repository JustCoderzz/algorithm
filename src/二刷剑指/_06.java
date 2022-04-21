package ¶þË¢½£Ö¸;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/**
 * @author lusir
 * @date 2022/4/18 - 10:36
 **/
public class _06 {
    public int[] reversePrint(ListNode head) {
        Deque<ListNode> stack=new ArrayDeque<>();
        ListNode p=head;
        while (p!=null) {
            stack.push(p);
            p=p.next;
        }
        int[] res=new int[stack.size()];
        int i=0;
        while (!stack.isEmpty()) {
            res[i++]=stack.pop().val;
        }
        return res;
    }
}
