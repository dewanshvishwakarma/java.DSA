package Linked_list;

public class odd_even {
    static Node odd(Node head){
        Node i=head;
        Node temp=head.next;
        Node j=head.next;

        while (j!=null && j.next!=null){
            i.next=j.next;
            i=i.next;
            j.next=i.next;
            j=j.next;
        }
        i.next=temp;
        return head;
    }
    static void main(String[] args) {


    }
}
