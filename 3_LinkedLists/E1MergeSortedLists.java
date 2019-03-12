/*
 * Write a program that takes two sorted linked lists and then merges them. TC would be O(n+m)
*/
public class E1MergeSortedLists {
    public static void main(String[] args) {
        int[] a = { 2, 5, 7 };
        int[] b = { 3, 11 };
        ListNode head1 = constructLL(a);
        ListNode head2 = constructLL(b);
        printLL(head1);
        printLL(head2);
        ListNode merged = merge(head1, head2);
        printLL(merged);
    }

    public static ListNode merge(ListNode l1, ListNode l2) {
        ListNode p1 = l1, p2 = l2, dummy = new ListNode(0);
        ListNode ans = dummy;
        while (p1 != null && p2 != null) {
            if (p1.data <= p2.data) {
                dummy.next = p1;
                p1 = p1.next;
            } else {
                dummy.next = p2;
                p2 = p2.next;
            }
            dummy = dummy.next;
        }
        dummy.next = (p1 == null) ? p2 : p1;
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