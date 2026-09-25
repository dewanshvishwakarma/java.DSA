package Linked_list;

public class reverse_by_position92 {
     if (head == null || left == right) {
        return head;
    }

    // Dummy node
    Node dummy = new ListNode(0);
    dummy.next = head;

    // Move prev to the node just before left
    ListNode prev = dummy;

        for (int i = 1; i < left; i++) {
        prev = prev.next;
    }

    // Reverse the portion
    ListNode curr = prev.next;

        for (int i = 0; i < right - left; i++) {

        ListNode next = curr.next;

        curr.next = next.next;
        next.next = prev.next;
        prev.next = next;
    }

        return dummy.next;
}
