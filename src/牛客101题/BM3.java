package Å£¿Í101Ìâ;

/**
 * @author lusir
 * @date 2022/3/31 - 10:43
 **/
public class BM3 {
    class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val=val;
    }
  }
    public ListNode reverseKGroup (ListNode head, int k) {

        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode cur=dummy;
        ListNode next;
        ListNode pre=dummy;
        while (cur!=null) {
            for (int i=0;i<k;i++){
                if (cur==null) break;
                cur=cur.next;
            }
            if (cur!=null) {
                next=cur.next;
                cur.next=null;
                ListNode start=pre.next;
                pre.next=reverse(pre.next);
                start.next=next;
                pre=start;
                cur=start;
            }
        }
        return dummy.next;

    }


    public ListNode reverse(ListNode head) {
        if (head==null||head.next==null) return head;

        ListNode tmp=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return  tmp;
    }
}
