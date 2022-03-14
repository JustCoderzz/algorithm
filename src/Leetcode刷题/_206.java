package LeetcodeÀ¢Ã‚;

/**
 * @author lusir
 * @date 2022/3/8 - 20:54
 **/
public class _206 {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode p=reverseList(head.next);
        head.next.next=p;
        head.next=null;
        return p;
    }
}
