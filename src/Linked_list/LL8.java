package Linked_list;

public class LL8 {
    static void print (Node temp){
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }
    static Node delete_at_position(Node head,int pos){
        // single node
        if (pos==1){
             head=head.next;
             return head;
        }
        Node temp=head;
        for (int i=1;i<pos-1;i++){
            temp=temp.next;
        }
         temp.next=temp.next.next;
        return head;
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
        System.out.println("before deletion ");
        print(head);
        System.out.println("after insertion ");
        head=delete_at_position(head,3);
        print(head);

    }
}
