package Linked_list;

public class reverseList2_lc92 {

    public Node reverseBetween(Node head, int left, int right){
        if (head == null || left == right) {
            return head;
        }

        // Dummy node
        Node dummy = new Node(0);
        dummy.next = head;

        // Move prev to the node just before left
        Node prev = dummy;

        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }


        ListNode curr = prev.next;

        for (int i = 0; i < right - left; i++) {

            Node next = curr.next;

            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }

        return dummy.next;
    }
    static void main(String[] args) {

    }
}
