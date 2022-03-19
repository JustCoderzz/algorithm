package ¶þË¢Á¦¿Û;

/**
 * @author lusir
 * @date 2022/3/14 - 23:05
 **/

public class _2 {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  public  ListNode addTwoNumbers(ListNode l1,ListNode l2){
          ListNode p=l1;
          ListNode q=l2;
          int sum=0;
          int exc=0;
          ListNode dummy=new ListNode(0);
          ListNode node=dummy;
          while(p!=null||q!=null){
              int a=p==null?0:p.val;
              int b=q==null?0:q.val;
              sum=a+b+exc;
              exc=sum/10;
              node.next=new ListNode(sum%10);
              node=node.next;
              if(p!=null){
                  p=p.next;
              }
              if (q!=null){
                  q=q.next;
              }
          }
          if(exc>0){
              node.next=new ListNode(1);
          }
          return dummy.next;
  }
}
