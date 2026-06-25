package DLL;

import jdk.jshell.spi.SPIResolutionException;

class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
public class DLL_creation {

    static void display(Node head){

        while(head != null){

            System.out.print(head.data + " ⇄ ");
            head = head.next;
        }

        System.out.println("null");
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);

        head.next=b;
        b.prev=head;

        b.next=c;
        c.prev=b;
        display(head);
     }
}
