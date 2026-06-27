package CLL;

public class insert_at_last {
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

    static Node insertLast(Node head, int data){
        Node newNode=new Node(data);

        if (head==null){
            newNode.next=newNode;
            return newNode;
        }
        Node temp=head;
        while (temp.next!=head){
            temp=temp.next;
        }

        temp.next=newNode;
        newNode.next=head;
        return head;
    }

    public static void main(String[] args) {
        Node head=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        head.next=b;
        b.next=c;
        c.next=head;
        Node h=insertLast(head,72);
        display(h);
    }
}
