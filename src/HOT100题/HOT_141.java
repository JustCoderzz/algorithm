package HOT100题;



/**
 * @author lusir
 * @date 2021/10/28 - 21:12
 **/
public class HOT_141 {
    public class ListNode{
        ListNode next;

    }
    public boolean hasCycle(ListNode head) {
//        对的  但是钻了空子
//        if(head==null) return false;
//        int v= (int) (2*Math.pow(10,5)+1);
//
//        while(head!=null){
//            HOT100题.ListNode p=head.next;
//            if(head.val>=Math.pow(10,5)){
//                return true;
//            }
//            head.val+=2*Math.pow(10,5)+1;
//            head=p;
//
//        }
//        return false;


//        哈希表
//        Set<HOT100题.ListNode> seen = new HashSet<HOT100题.ListNode>();
//        while (head != null) {
//            if (!seen.add(head)) {
//                return true;
//            }
//            head = head.next;
//        }
//        return false;

//      快慢指针
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;


    }
}
