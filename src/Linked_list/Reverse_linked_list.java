package Linked_list;

public class Reverse_linked_list {
    static Node reverse(Node head){
        Node pre=null;
        Node current=head;
        Node temp=null;
        while (current!=null){
            temp=current.next;
            current.next=pre;
            pre=current;
            current=temp;
        }
return pre;
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
        head=reverse(head);
        print(head);
    }
}
