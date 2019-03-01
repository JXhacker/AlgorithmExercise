package LeetCode.Algorithm;

import java.util.List;

/**
 * @author wanzhiwen
 * @time 2019/3/1
 */
public class q24 {

    //best java version
    public ListNode swapPairs1(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next.next;
            first.next = second.next;
            current.next = second;
            current.next.next = first;
            current = current.next.next;
        }
        return dummy.next;
    }

    public static ListNode swapPairs(ListNode head) {
        ListNode l1 = head;
        if (l1 == null) return null;
        ListNode l2 = l1.next;
        if (l2 == null) return head;
        head = l2;
        while (l1 != null && l2 != null) {
            l1.next = l2.next;
            l2.next = l1;
            if (l1.next != null && l1.next.next != null) {
                ListNode temp = l1.next;
                l1.next = l1.next.next;
                l1 = temp;
                l2 = temp.next;
            } else {
                l1 = l1.next;
                l2 = null;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        ListNode a = swapPairs(n1);
        System.out.println(a.val);
        System.out.println(a.next.val);
        System.out.println(a.next.next.val);
    }

}
