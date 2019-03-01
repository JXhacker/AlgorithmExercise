package LeetCode.Algorithm;

import java.util.List;

/**
 * @author wanzhiwen
 * @time 2019/2/28
 */
public class q23 {


    //java version using recursion
    public static ListNode mergeKLists1(ListNode[] lists) {
        if (lists.length==0) return null;
        return part(lists, 0, lists.length - 1);
    }

    public static ListNode part(ListNode[] lists, int start, int end) {
        if (start == end) {
            return lists[start];
        } else {
            int mid = (start + end) / 2;
            ListNode l1=part(lists,start,mid);
            ListNode l2=part(lists,mid+1,end);
            return mergeTwoLists(l1,l2);
        }
    }


    //my version
    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        ListNode listNode = lists[0];
        for (int i = 1; i < lists.length; i++) {
            listNode = mergeTwoLists(listNode, lists[i]);
        }
        return listNode;
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
