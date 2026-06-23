package Linked_list;

public class LL_detect_loop {
    static boolean detect(Node head){
        Node s=head;
        Node f=head;

        while (f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;

            if (s==f){
                return true;
            }
        }
        return  false;
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(500);

        head.next=b;
        b.next=c;
        c.next=d;
        d.next=head;

        boolean loop=detect(head);
        System.out.println(loop);

    }
}
