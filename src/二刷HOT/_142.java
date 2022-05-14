package ¶þË¢HOT;

/**
 * @author lusir
 * @date 2022/5/14 - 11:01
 **/
public class _142 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(true){
            if(fast==null||fast.next==null) return null;
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast) break;
        }
        fast=head;
        while(fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
}
