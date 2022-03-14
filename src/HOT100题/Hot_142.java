package HOT100Ã‚;

/**
 * @author lusir
 * @date 2022/2/26 - 22:08
 **/
public class Hot_142 {

      class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
         }
      }


        public ListNode detectCycle(ListNode head) {
            if (head == null) {
                return null;
            }
            ListNode slow = head, fast = head;
            while (fast != null) {
                slow = slow.next;
                if (fast.next != null) {
                    fast = fast.next.next;
                } else {
                    return null;
                }
                if (fast == slow) {
                    ListNode ptr = head;
                    while (ptr != slow) {
                        ptr = ptr.next;
                        slow = slow.next;
                    }
                    return ptr;
                }
            }
            return null;
        }


}
