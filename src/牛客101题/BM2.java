package Å£¿Í101Ìâ;

/**
 * @author lusir
 * @date 2022/3/31 - 9:35
 **/
public class BM2 {

      class ListNode {
        int val;
        ListNode next = null;
      }

    public ListNode reverseBetween (ListNode head, int m, int n) {

          int count=1;
          ListNode dummy=new ListNode();
          dummy.next=head;
          ListNode pre=dummy;
          ListNode cur=head;
          while (cur!=null&&count<m) {
              pre=pre.next;
              cur=cur.next;
              count++;
          }
          ListNode start=cur;
          while (cur!=null&&count<n) {
              cur=cur.next;
              count++;
          }
          ListNode tail=cur.next;
          cur.next=null;
          cur=start;
          while (cur!=null) {
              ListNode tmp=cur.next;
              cur.next=tail;
              tail=cur;
              cur=tmp;
          }
          pre.next=tail;
          return dummy.next;

    }
}
