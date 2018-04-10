package linkedlist;

/**
 * Created with IDEA
 *
 * @author duzhentong
 * @Date 2018/4/10
 * @Time 8:23
 */
public class Practice206 {
    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode curr = head.next;
        ListNode next = null;
        ListNode pre = head;
        while (curr != null) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        head.next = null;
        head = pre;
        return head;
    }
}
class ListNode{
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }

}

