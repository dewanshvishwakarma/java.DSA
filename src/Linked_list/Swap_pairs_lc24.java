package Linked_list;

public class Swap_pairs_lc24 {
    public Node swapPairs(Node head){
        Node d=new Node(0);
        d.next =head;
        Node c=head;
        Node pre=d;
        while (c!=null && c.next!=null){
            Node n=c.next;
            c.next=n.next;
            n.next=c;
            pre.next=n;
            pre=c;
            c=c.next;
        }
        return d.next;
    }

}
