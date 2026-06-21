package Linked_list;
//learn insertion at end;

//class Node{
//    int data;
//    Node next;
//
//    Node(int data){
//        this.data=data;
//        this.next=null;
//    }
//}
public class LL4 {
    static Node Add_last(Node head,int data){
        Node newNode=new Node(data);
        Node temp=head;
        newNode.next=null;

        if (head==null){
            return newNode;
        }

        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return head;
    }


    static void display(Node temp){
        while (temp!=null){
            System.out.println(temp.data + " ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        Node head=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);

        head.next=b;
        b.next=c;

        head=Add_last(head,500);
        display(head);

//        Node head =null;
//        head=Add_last(head,10);
//        display(head);


    }
}
