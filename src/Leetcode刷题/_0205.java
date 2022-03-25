package LeetcodeÀ¢Ã‚;

/**
 * @author lusir
 * @date 2022/3/24 - 23:52
 **/
public class _0205 {
      class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

          ListNode head=new ListNode(0);
          ListNode cur=head;
          int exc=0;
          while (l1!=null||l2!=null) {
              int a=l1==null?0:l1.val;
              int b=l2==null?0:l2.val;
              int sum=a+b+exc;
              exc=sum/10;
              cur.next=new ListNode(sum%10);
              cur=cur.next;
              if (l1!=null) l1=l1.next;
              if (l2!=null) l2=l2.next;
          }
          if (exc==1){
              cur.next=new ListNode(1);
          }
          return head.next;
    }
}
