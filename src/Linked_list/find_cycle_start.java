package Linked_list;

public class find_cycle_start {

    public static Node cycleStart(Node head){
        Node f=head;
        Node s=head;
        while (f!=null && f.next!=null){
            f=f.next.next;
            s=s.next;

            if (f==s){
                s=head;
                while (s!=f){
                    s=s.next;
                    f=f.next;
                }
                return s;
            }
        }
        return null;
    }
    public static void main(String[] args){
        Node head = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        head.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

// Create cycle
        e.next = c;

        Node res=cycleStart(head);
        System.out.println(res);

    }
}
