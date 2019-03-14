/*
 * Write a program which deletes a node in Linked List. Input node will not be tail node.
*/
public class E6DeleteNodeNotTail {
    public static void main(String[] args) {
        // this wont work, but look at delete method to understand the code
    }

    // Assume that the parameter is exactly the node to delete and that it is not
    // the last element or tail in linkedlist
    public static void delete(ListNode nodeToDelete) {
        // copy next node's data into this node
        nodeToDelete.data = nodeToDelete.next.data;
        nodeToDelete.next = nodeToDelete.next.next;
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