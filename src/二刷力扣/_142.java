package ��ˢ����;

/**
 * @author lusir
 * @date 2022/3/13 - 14:56
 **/
public class _142 {
      class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public  ListNode detectCycle(ListNode head){
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
