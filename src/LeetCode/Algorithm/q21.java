package LeetCode.Algorithm;

import java.util.List;

/**
 * @author wanzhiwen
 * @time 2019/2/27
 */
public class q21 {


    //best java version(recursion)
    public static ListNode mergeTwoLists1(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val < l2.val){
            l1.next = mergeTwoLists1(l1.next, l2);
            return l1;
        } else{
            l2.next = mergeTwoLists1(l1, l2.next);
            return l2;
        }
    }

    //my answer
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode n1 = l1, n2 = l2;
        ListNode res = new ListNode(0);
        while (n1 != null && n2 != null) {
            if (n1.val >= n2.val) {
                res.next = n2;
                res = res.next;
                n2 = n2.next;
            } else {
                res.next = n1;
                res = res.next;
                n1 = n1.next;
            }
        }
        if (n1 == null) {
            res.next = n2;
        }
        if (n2 == null) {
            res.next = n1;
        }
        return l1.val >= l2.val ? l2 : l1;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        ListNode n11 = new ListNode(1);
        ListNode n12 = new ListNode(2);
        ListNode n13 = new ListNode(3);
        ListNode n14 = new ListNode(4);
        n11.next = n12;
        n12.next = n13;
        n13.next = n14;

        ListNode l=mergeTwoLists1(n1,n11);
        System.out.println(l.val);
        System.out.println(l.next.val);
        System.out.println(l.next.next.val);
        System.out.println(l.next.next.next.val);
    }
}
