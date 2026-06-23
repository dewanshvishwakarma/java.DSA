package Linked_list;
// insertion at n-th position
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LL7 {
    static Node Insert_at_position(Node head,int pos,int data){
        // single node
        Node newNode=new Node(data);
        if (pos==1){
            newNode.next=head;
            newNode=head;
            return head;
        }
        Node temp=head;
        for (int i=1;i<pos-1;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
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
        Node d=new Node(40);
        Node e=new Node(50);
        head.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        System.out.println("before insertion ");
        print(head);
        System.out.println("after insertion ");
        head=Insert_at_position(head,4,500);
        print(head);
    }
}
