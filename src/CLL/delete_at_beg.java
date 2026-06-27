package CLL;

public class delete_at_beg {
    static Node deleteFirst(Node head){

        // Empty list
        if(head == null){
            return null;
        }

        // Single node
        if(head.next == head){
            return null;
        }

        Node temp = head;

        // Find last node
        while(temp.next != head){
            temp = temp.next;
        }

        // Move head
        head = head.next;

        // Last points to new head
        temp.next = head;

        return head;
    }
    static void display(Node head){
        if (head==null){
            return;
        }
        Node temp=head;
        do{
            System.out.println(temp.data + " ");
            temp=temp.next;
        }while (temp!=head);
        System.out.println();
    }

    public static void main(String[] args) {
        Node head=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        head.next=b;
        b.next=c;
        c.next=head;
        Node h=deleteFirst(head);
        display(h);
    }
}
