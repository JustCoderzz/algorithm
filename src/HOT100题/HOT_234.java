//package HOT100题;

/**
 * @author lusir
 * @date 2021/10/16 - 18:23
 **/
   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class HOT_234 {
 public boolean isPalindrome(ListNode head) {
     if(head==null){
         return true;
     }
//     找到中间结点
     ListNode half=findHalfOfList(head);
//     将中间结点以后的链表反转
     ListNode end=reverseList(half.next);
//     判断是否是回文
     boolean result=true;
    ListNode p=head;
    ListNode q=end;
    while (result&&q!=null){
        if(p.val!=q.val){
            result=false;
        }
        p=p.next;
        q=q.next;
    }
    half.next=reverseList(end);
    return result;
 }

// 反转链表
    private  ListNode reverseList(ListNode root){
     ListNode pre=null;
     ListNode cur=root;
     while(cur!=null){
         ListNode tmp=cur.next;
         cur.next=pre;
         pre=cur;
         cur=tmp;
     }
     return pre;
    }


// 找到中间结点
 private ListNode findHalfOfList(ListNode root){
     ListNode fast=new ListNode();
     ListNode slow=new ListNode();
     fast=root;
     slow=root;
     while(fast.next!=null&&fast.next.next!=null){
         fast=fast.next.next;
         slow=slow.next;
     }
     return slow;
 }


}
