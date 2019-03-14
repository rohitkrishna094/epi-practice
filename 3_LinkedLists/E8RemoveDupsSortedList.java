public class E8RemoveDupsSortedList {
    public static void main(String[] args) {
        int a[] = { 2, 2, 3, 5, 7, 11, 11 };
        ListNode head = constructLL(a);
        head = removeDups(head);
        printLL(head);
    }

    public static ListNode removeDups(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            ListNode nextDistinct = cur.next;
            while (nextDistinct != null && nextDistinct.data == cur.data) {
                nextDistinct = nextDistinct.next;
            }
            cur.next = nextDistinct;
            cur = nextDistinct;
        }
        return head;
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