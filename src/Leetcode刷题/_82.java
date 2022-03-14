package Leetcode刷题;

/**
 * @author lusir
 * @date 2022/3/13 - 14:24
 **/
public class _82 {
      public class ListNode {
          int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode deleteDuplicates(ListNode head) {
            if(head==null) return null;
          ListNode dummy=new ListNode(0);
          dummy.next=head;
          ListNode pre=dummy;
          ListNode slow=dummy.next;
          ListNode fast=slow.next;
          while(fast!=null){
                if(fast.val!=slow.val){
                    pre.next=slow;
                    slow=slow.next;
                    fast=fast.next;
                    pre=pre.next;
                    continue;
                }
              while(fast!=null&&fast.val==slow.val){
                  fast=fast.next;
              }
              pre.next=fast;
              if(fast!=null){
                  slow=fast;
                  fast=fast.next;
              }

          }
          return dummy.next;
//          力扣的解答
//          public ListNode deleteDuplicates(ListNode head) {
//        if (head == null) {
//            return head;
//        }
//
//        ListNode dummy = new ListNode(0, head);
//
//        ListNode cur = dummy;
//        while (cur.next != null && cur.next.next != null) {
//            if (cur.next.val == cur.next.next.val) {
//                int x = cur.next.val;
//                while (cur.next != null && cur.next.val == x) {
//                    cur.next = cur.next.next;
//                }
//            } else {
//                cur = cur.next;
//            }
//        }
//
//        return dummy.next;
//    }
//

    }
}
