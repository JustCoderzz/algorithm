package LeetcodeÀ¢Ã‚;

/**
 * @author lusir
 * @date 2022/3/14 - 21:28
 **/
public class _328 {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode oddEvenList(ListNode head) {
          if(head==null) return null;
        ListNode slow=head;
        ListNode fast=head.next;
        ListNode pre=fast;
        while (fast!=null&&fast.next!=null){
            slow.next=fast.next;
            slow=slow.next;
            fast.next=slow.next;
            fast=fast.next;
        }
        slow.next=pre;
        return head;
    }
}
