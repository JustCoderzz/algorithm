package ¶þË¢HOT;

/**
 * @author lusir
 * @date 2022/5/9 - 22:57
 **/
public class _19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode slow=head;
        ListNode pre=dummy;
        ListNode fast=dummy;
        for (int i = 0; i < n; i++) {
            fast=fast.next;
        }
        while (fast.next!=null){
            fast=fast.next;
            slow=slow.next;
            pre=pre.next;
        }
        pre.next=slow.next;
        return dummy.next;
    }
}
