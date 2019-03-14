public class E7RemoveKLastElement {
    public static void main(String[] args) {
        int[] a = { 11, 3, 5, 7, 2 };
        ListNode head = constructLL(a);
        printLL(head);
        head = removeKthLastElement(head, 3);
        printLL(head);
    }

    public static ListNode removeKthLastElement(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy.next;
        while (k > 0) {
            first = first.next;
            k--;
        }

        ListNode second = dummy;
        while (first != null) {
            second = second.next;
            first = first.next;
        }

        // second points to (k+1)th last node, delete its succesor
        second.next = second.next.next;
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