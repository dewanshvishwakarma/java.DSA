package Linked_list;
// learn insert in first without function
import java.util.Stack;

//class Node{
//    int data;
//    Node next;
//
//    Node(int data){
//        this.data=data;
//        this.next=null;
//    }
//}
public class LL2 {
    public static void main(String[] args) {
        Node head=new Node(20);
        Node b=new Node(30);
        Node c=new Node(40);

        head.next=b;
        b.next=c;

        Node newNode=new Node(10);
        newNode.next=head;
        head=newNode;

        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data  + " ");
            temp=temp.next;
        }
    }
}

