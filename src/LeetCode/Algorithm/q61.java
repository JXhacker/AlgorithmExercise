package LeetCode.Algorithm;

/**
 * @author wanzhiwen
 * @time 2019/3/7
 */
public class q61 {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode root = new ListNode(0);
        root.next = head;
        ListNode temp = root;
        ListNode temp2 = root;
        ListNode p, q;
        int length = 0;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }
        if (length==0) return head;
        k = k % length;
        if (k == 0) return head;
        for (int i = 0; i < (length - k); i++) temp2 = temp2.next;
        temp.next = root.next;
        root.next = temp2.next;
        temp2.next = null;
        return root.next;
    }
}
