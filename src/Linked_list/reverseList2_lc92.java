package Linked_list;

public class reverseList2_lc92 {

    public Node reverseBetween(Node head, int left, int right){
        if (head == null || left == right) {
            return head;
        }

        // Dummy node
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Move prev to the node just before left
        ListNode prev = dummy;

        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }
    }
    static void main(String[] args) {

    }
}
