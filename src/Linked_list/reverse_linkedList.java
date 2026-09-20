package Linked_list;
//reverse the link list
public class reverse_linkedList {
    static Node reverse(Node head){
        Node pre=null;
        Node current=head;
        while (current!=null){
            Node Next=current.next;
            current.next=pre;
            pre=current;
            current=Next;
        }
        return pre;
    }

    static void display(Node temp){
        while (temp!=null){
            System.out.println(temp.data + " ");
            temp=temp.next;
        }
    }
    public static void main(String[] args){
        Node head=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);

        head.next=b;
        b.next=c;

        Node reverse=reverse(head);
        display(reverse);
    }
}
