package LeetCode.Algorithm;

/**
 * @author wanzhiwen
 * @time 2019/2/26
 */

public class q19 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node1 = head, node2 = head;
        for (int i = 0; node2!=null&&i < n; i++) {
            node2 = node2.next;
        }
        if (node2==null){
            head=head.next;
            return head;
        }
        while (node2.next != null) {
            node1 = node1.next;
            node2 = node2.next;
        }
        if (n==1){
            node1.next=null;
        }else {
            node1.next=node1.next.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode n1=new ListNode(1);
        ListNode n2=new ListNode(2);
        ListNode n3=new ListNode(3);
        ListNode n4=new ListNode(4);
        n1.next=n2;n2.next=n3;n3.next=n4;
        n1=removeNthFromEnd(n1,3);
        System.out.println(n1.val);
        System.out.println(n1.next.val);
        System.out.println(n1.next.next.val);
    }
}
