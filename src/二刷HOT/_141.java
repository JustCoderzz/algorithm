package ¶þË¢HOT;

/**
 * @author lusir
 * @date 2022/5/13 - 22:06
 **/
public class _141 {
    public boolean hasCycle(ListNode head) {
        if (head==null) return false;
        ListNode slow=head;
        ListNode fast=head.next;
        while (fast!=null&&fast.next!=null){
            if (fast==slow) return true;
            slow=slow.next;
            fast=fast.next.next;
        }
        return false;
    }
}
