/*
 * Write a program that takes a linked list, s,f(start, finish) and reverse nodes from sth node to fth node(both inclusive).
 * Numbering begins at 1 i.e., head node is the first node(number 1 node). Try not to allocate any additional nodes
*/
public class E2ReverseSubList {
    public static void main(String[] args) {
        int[] a = { 11, 3, 5, 7, 2 };
        ListNode head = constructLL(a);
        printLL(head);
        ListNode res = reverseSublist(head, 2, 4);
        printLL(res);
    }

    public static ListNode reverseSublist(ListNode l, int start, int finish) {
        if (start == finish)
            return l;
        ListNode dummy = new ListNode(0);
        dummy.next = l;
        ListNode subListHead = dummy;
        int k = 1;
        while (k++ < start) {
            subListHead = subListHead.next;
        }

        // start reversing
        ListNode subListIter = subListHead.next;
        while (start++ < finish) {
            ListNode temp = subListIter.next;
            subListIter.next = temp.next;
            temp.next = subListHead.next;
            subListHead.next = temp;
        }
        return dummy.next;
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