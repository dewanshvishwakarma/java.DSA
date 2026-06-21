package Linked_list;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LL3 {

    static Node Add_First(Node head,int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        return newNode;
    }

    static void display(Node temp){
        while (temp!=null){
            System.out.println(temp.data + " ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(20);
        Node b=new Node(30);
        Node c=new Node(40);
        Node d=new Node(50);

        head.next=b;
        b.next=c;
        c.next=d;

        head=Add_First(head,10);
        head=Add_First(head,-10);
        display(head);

    }
}
