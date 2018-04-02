package a;

/**
 *
 * 合并两个有序的链表，合并之后依然保持有序
 * Created with IDEA
 *
 * @author DuzhenTong
 * @Date 2018/4/2
 * @Time 20:07
 */
public class Solution {
    public static void main(String[] args) {

    }

    public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode list0 = null;
        if (list1.val > list2.val) {
            list0 = list1;
            list0.next = Merge(list1.next, list2);
        } else {
            list0 = list2;
            list0.next = Merge(list1, list2.next);
        }
        return list0;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }

}
