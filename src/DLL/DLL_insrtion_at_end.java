package DLL;

public class DLL_insrtion_at_end {
    static void display(Node head){

        while(head != null){
            System.out.print(head.data + " ⇄ ");
            head = head.next;
        }

        System.out.println("null");
    }

    static Node insert_end(Node head,int data){
        Node newNode=new Node(data);

        if (head==null){
            return newNode;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
        newNode.next=null;

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
        Node h=insert_end(head,500);
        display(head);

    }
}
