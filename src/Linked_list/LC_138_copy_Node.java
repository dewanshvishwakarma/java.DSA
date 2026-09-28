package Linked_list;

import java.util.HashMap;

public class LC_138_copy_Node {

    public Node copyRandomList(Node head) {

        if (head == null) {
            return null;
        }

        HashMap<Node, Node> map = new HashMap<>();

        Node curr = head;
        Node temp = null;
        Node newHead = null;

        // Pass 1: Create copy nodes
        while (curr != null) {

            Node n = new Node(curr.data);

            map.put(curr, n);

            if (newHead == null) {
                newHead = n;
                temp = newHead;
            } else {
                temp.next = n;
                temp = n;
            }

            curr = curr.next;
        }

        // Pass 2: Connect random pointers
        curr = head;
        Node ncurr = newHead;

        while (curr != null) {

            if (curr.random == null) {
                ncurr.random = null;
            } else {
                ncurr.random = map.get(curr.random);
            }

            curr = curr.next;
            ncurr = ncurr.next;
        }

        return newHead;
    }
}