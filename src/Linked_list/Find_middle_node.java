package Linked_list;

public class Find_middle_node {
    static Node middle(Node head){// for odd number of node
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    //for even number of node there are two middle first and second 1,2,3,4
    static Node middle2(Node head){// for second middle
        Node s=head;
        Node f=head;
        while (f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }

    static Node middle3(Node head){// for second middle
        Node s=head;
        Node f=head.next;
        while (f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
//        Node e=new Node(50);
        head.next=b;
        b.next=c;
        c.next=d;
//        d.next=e;

        head=middle3(head);
        System.out.println(head.data);
    }
}
