package Linked_list;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LL5 {
    static Node delete_beg(Node head){
        if (head==null){
            return null;
        }
        head=head.next;
        return head;
    }

    static void print (Node temp){
        while (temp!=null){
            System.out.println(temp.data + " ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);

        head.next=b;
        b.next=c;
        c.next=d;
        System.out.println("before delete");
        print(head);
        System.out.println("after delete first node");
        head=delete_beg(head);
        print(head);



    }

}
