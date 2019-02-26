package LeetCode.Algorithm;

/**
 * @author wanzhiwen
 * @time 2019/1/12
 */




public class q2 {

    //best answer
    public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode sentinel = new ListNode(0);
        ListNode d = sentinel;
        int sum = 0;
        while (c1 != null || c2 != null) {
            sum /= 10;
            if (c1 != null) {
                sum += c1.val;
                c1 = c1.next;
            }
            if (c2 != null) {
                sum += c2.val;
                c2 = c2.next;
            }
            d.next = new ListNode(sum % 10);
            d = d.next;
        }
        if (sum / 10 == 1)
            d.next = new ListNode(1);
        return sentinel.next;
    }


    //my answer
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int surplus = 0;//存进位
        ListNode node = null;
        ListNode newNode = null;
        ListNode nodePtr = null;
        int newData;
        while (l1 != null && l2 != null) {
            if (node == null) {
                newData = (l1.val + l2.val + surplus) % 10;
                if ((l1.val + l2.val + surplus) >= 10) {
                    surplus = 1;
                }
                newNode = new ListNode(newData);
                node = newNode;
                nodePtr = node;
                l1 = l1.next;
                l2 = l2.next;
            } else {
                newData = (l1.val + l2.val + surplus) % 10;
                if ((l1.val + l2.val + surplus) >= 10) {
                    surplus = 1;
                } else {
                    surplus = 0;
                }
                newNode = new ListNode(newData);
                nodePtr.next = newNode;
                nodePtr = newNode;
                l1 = l1.next;
                l2 = l2.next;
            }
        }
        if (l1 != null) {
            while (l1 != null) {
                newData = (l1.val + surplus) % 10;
                if ((l1.val + surplus) >= 10) {
                    surplus = 1;
                } else {
                    surplus = 0;
                }
                newNode = new ListNode(newData);
                nodePtr.next = newNode;
                nodePtr = newNode;
                l1 = l1.next;
            }
        }
        if (l2 != null) {
            while (l2 != null) {
                newData = (l2.val + surplus) % 10;
                if ((l2.val + surplus) >= 10) {
                    surplus = 1;
                } else {
                    surplus = 0;
                }
                newNode = new ListNode(newData);
                nodePtr.next = newNode;
                nodePtr = newNode;
                l2 = l2.next;
            }
        }
        if (surplus == 1) {
            newNode = new ListNode(1);
            nodePtr.next = newNode;
        }
        return node;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(5);
        ListNode l3 = addTwoNumbers(l1, l2);
        System.out.println(l3.val + " " + l3.next.val);
    }

}
