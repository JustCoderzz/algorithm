package LeetcodeÀ¢Ã‚;

/**
 * @author lusir
 * @date 2022/3/12 - 16:57
 **/
public class _92 {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
        public  ListNode reverseBetween(ListNode head,int left,int right){
            ListNode dummy=new ListNode(0);
            ListNode pre=dummy;
            pre.next=head;
            for(int i=0;i<left-1;i++){
                pre=pre.next;
            }
            ListNode cur=pre.next;
            ListNode next;
            for(int i=0;i<right-left;i++){
                next=cur.next;
                cur.next=next.next;
                next.next=pre.next;
                pre.next=next;
            }
            return dummy.next;
        }

//      public ListNode reverseBetween(ListNode head, int left, int right) {
//          ListNode dummy=new ListNode(0);
//          ListNode pre=dummy;
//          pre.next=head;
//          for(int i=0;i<left-1;i++){
//              pre=pre.next;
//          }
//          ListNode tail=pre;
//          for(int i=0;i<right-left+1;i++){
//              tail=tail.next;
//          }
//          ListNode leftNode=pre.next;
//          ListNode rightNode=tail.next;
//          pre.next=null;
//          tail.next=null;
//          reverse(leftNode);
//          pre.next=tail;
//          leftNode.next=rightNode;
//          return dummy.next;
//
//
//      }
//
//
//      public  void reverse(ListNode l){
//          if(l==null||l.next==null) return ;
//          reverse(l.next);
//          l.next.next=l;
//          l.next=null;
//
//      }
}
