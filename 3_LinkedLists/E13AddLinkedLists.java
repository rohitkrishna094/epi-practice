/*
 * Write a program that takes two linkedlists and adds them and returns the head back. MSB is at the end or tail
 * Time complexity is O(n+m) , where n is length of first list and m the second list
*/
public class E13AddLinkedLists {
    public static void main(String[] args) {
        int a[] = { 3, 1, 4 };
        int b[] = { 7, 0, 9 };
        ListNode l1 = constructLL(a);
        ListNode l2 = constructLL(b);
        ListNode result = addTwoLinkedLists(l1, l2);
        printLL(l1);
        printLL(l2);
        printLL(result);

    }

    public static ListNode addTwoLinkedLists(ListNode l1, ListNode l2) {
        ListNode p1 = l1, p2 = l2;
        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;
        int carry = 0;
        while (p1 != null || p2 != null) {
            int x = (p1 == null) ? 0 : p1.data;
            int y = (p2 == null) ? 0 : p2.data;
            int res = x + y + carry;
            carry = res / 10;
            dummy.next = new ListNode(res % 10);
            dummy = dummy.next;
            if (p1 != null)
                p1 = p1.next;
            if (p2 != null)
                p2 = p2.next;
        }
        if (carry > 0) {
            dummy.next = new ListNode(carry);
        }
        return ans.next;
    }

    public static void printLL(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.data + " -> ");
            cur = cur.next;
        }
        System.out.println("null");
    }

    public static ListNode constructLL(int[] a) {
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        for (int i = 0; i < a.length; i++) {
            dummy.next = new ListNode(a[i]);
            dummy = dummy.next;
        }
        return head.next;
    }

    static class ListNode {
        public int data;
        public ListNode next;

        public ListNode(int data) {
            this.data = data;
            next = null;
        }
    }
}