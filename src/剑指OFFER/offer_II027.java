package 剑指OFFER;

/**
 * @author lusir
 * @date 2022/3/7 - 10:10
 **/
public class offer_II027 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public  boolean isPalindrome(ListNode head){
        ListNode node=head;
        ListNode mid=findMid(head);
        ListNode pre=reverseList(mid.next);
        while(pre!=null){
            if(node.val!=pre.val) return false;
            node=node.next;
            pre=pre.next;
        }
        return true;
    }


    //找到中间结点
    public  ListNode findMid(ListNode root){
        ListNode fast=root;
        ListNode slow=root;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    //翻转链表
    public  ListNode reverseList(ListNode root){
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
}
