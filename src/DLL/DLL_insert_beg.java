package DLL;

public class DLL_insert_beg {
    static void display(Node head){

        while(head != null){
            System.out.print(head.data + " ⇄ ");
            head = head.next;
        }

        System.out.println("null");
    }

    static Node addFirst(Node head, int data){
        Node newNode=new Node(data);
        if (head==null){
            return newNode;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
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

        head = addFirst(head,10);

        display(head);
    }
}
