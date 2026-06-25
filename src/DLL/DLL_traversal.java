package DLL;

public class DLL_traversal {

    static void forward(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data + " ");
            temp=temp.next;
        }
    }
    static void backward(Node head){
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.prev;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);

        head.next = b;
        b.prev = head;

        b.next = c;
        c.prev = b;

        System.out.println("Forward:");
        forward(head);

        System.out.println("Backward:");
        backward(head);
    }
}
