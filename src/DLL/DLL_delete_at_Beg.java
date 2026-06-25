package DLL;

public class DLL_delete_at_Beg {

    static void display(Node head){

        while(head != null){
            System.out.print(head.data + " ⇄ ");
            head = head.next;
        }

        System.out.println("null");
    }
    static Node delete_beg(Node head){
        if (head==null){
            return null;
        }
        if (head.next==null){
            return null;
        }

        head=head.next;
        head.prev=null;
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(20);
        Node b = new Node(30);
        Node c = new Node(40);

        head.next = b;
        b.prev = head;

        b.next = c;
        c.prev = b;
        Node h=delete_beg(head);
        display(h);

    }
}
