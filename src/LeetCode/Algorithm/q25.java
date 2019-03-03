package LeetCode.Algorithm;

/**
 * @author wanzhiwen
 * @time 2019/3/2
 */
public class q25 {

    public ListNode reverseKGroup(ListNode head, int k) {
        int count = 0;
        ListNode curr = head;
        while (curr != null && count != k) {
            count++;
            curr = curr.next;
        }
        if (count == k) {
            curr = reverseKGroup(curr, k);
            while (count-- != 0) {
                ListNode temp = head.next;
                head.next = curr;
                curr = head;
                head = temp;
            }
            head=curr;
        }
        return head;
    }

}
