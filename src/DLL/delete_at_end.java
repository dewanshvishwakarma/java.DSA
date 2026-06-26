package DLL;

public class delete_at_end {
    static void display(Node head){

        while(head != null){
            System.out.print(head.data + " ⇄ ");
            head = head.next;
        }

        System.out.println("null");
    }

    static  Node delete_end(Node head){
        Node temp=head;
        while (temp.next.next!=null){
            temp=temp.next;
        }
        temp.next.prev=null;
        temp.next=null;
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
        Node h=delete_end(head);
        display(h);
    }
}
