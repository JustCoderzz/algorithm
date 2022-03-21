package LeetcodeÀ¢Ã‚;

/**
 * @author lusir
 * @date 2022/3/21 - 18:17
 **/
public class _24 {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode swapPairs(ListNode head) {
        return dfs(head);
    }

    public  ListNode dfs(ListNode head){
          if(head==null||head.next==null) return head;
          ListNode next=head.next;
          head.next=dfs(head.next.next);
          next.next=head;
          return next;
    }
}
