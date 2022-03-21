package LeetcodeÀ¢Ã‚;

/**
 * @author lusir
 * @date 2022/3/21 - 15:38
 **/
public class _83 {
      class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node=new ListNode(201);
        node.next=head;
        return dfs(node,node.val).next;
    }
    public  ListNode dfs(ListNode head,int value){
          if(head==null) return null;
          if(head.val==value){
              return dfs(head.next,value);
          }else{
              head.next=dfs(head.next,head.val);
              return head;
          }
    }
}
