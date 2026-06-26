package DLL;

public class reverse_DLL {
    static Node Reverse(Node head){
        if (head==null || head.next==null)
        {
            return head;
        }
        Node t=null;
        Node temp=head;

        while (temp!=null){
            t=temp.prev;
            temp.prev=temp.next;
            temp.next=t;

            temp=temp.prev;
        }
        return t.prev;
    }
    static void display(Node head){

        while(head != null){
            System.out.print(head.data + " ⇄ ");
            head = head.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(20);
        Node b = new Node(30);
        Node c = new Node(40);

        head.next = b;
        b.prev = head;

        b.next = c;
        c.prev = b;
        Node h=Reverse(head);
        display(h);
    }
}
