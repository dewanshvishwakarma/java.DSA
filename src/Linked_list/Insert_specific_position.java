package Linked_list;
// insert AT specific position
public class Insert_specific_position {
    static Node insertAtBeg(Node head,int data,int pos){
        Node n=new Node(data);
        Node temp=head;
        int i=1;
        while (i<pos-1){
            i++;
            temp=temp.next;
        }
        n.next=temp.next;
        temp.next=n;

        return head;
    }

    static void display(Node temp){
        while (temp!=null){
            System.out.println(temp.data + " ");
            temp=temp.next;
        }
    }

   public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d=new Node(40);
        a.next = b;
        b.next=c;
        c.next=d;

        Node result=insertAtBeg(a,25,3);
        display(result);

    }
}
