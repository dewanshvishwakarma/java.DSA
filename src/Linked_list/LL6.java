package Linked_list;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LL6 {

    static Node DeleteLast(Node head){
        //case 1 : no node
        if (head==null){
            return null;
        }
        if (head.next==null){//only one node
            return null;
        }

        Node temp=head;
        while (temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }

    static void print (Node temp){
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(500);

        head.next=b;
        b.next=c;
        c.next=d;
        System.out.println("before deletion ");
        print(head);
        System.out.println("after deletion");
        head=DeleteLast(head);
        print(head);
    }
}
