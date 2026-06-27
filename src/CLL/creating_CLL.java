package CLL;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class creating_CLL {

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

        display(head);
    }
}
