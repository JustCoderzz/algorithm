package LeetcodeÀ¢Ã‚;

/**
 * @author lusir
 * @date 2022/3/12 - 18:51
 **/

public class _141 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }


    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null) return false;
        ListNode slow=head;
        ListNode fast=head.next;
        while(slow!=fast){
            if(fast==null||fast.next==null) return false;
            slow=slow.next;
            fast=fast.next.next;
        }
        return true;

    }
}
