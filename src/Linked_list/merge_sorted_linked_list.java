package Linked_list;

public class merge_sorted_linked_list {
    static Node merge(Node head1, Node head2){
        Node dummy=new Node(0);
        Node temp=dummy;

        while (head1!=null && head1!=null){
            if (head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
            }else {
                temp.next=head2;
                head2=head2.next;
            }
            temp=temp.next;
        }
        if (head1 != null) {
            temp.next = head1;
        }

        if (head2 != null) {
            temp.next = head2;
        }
        return dummy.next;
    }

    public static void main(String[] a){


    }
}
