package Linked_list;

public class LC21merge_two_sorted_linklist {


    static Node merge(Node head1,Node head2){
        Node d= new Node(-1);
        Node temp=d;
        Node t1=head1;
        Node t2=head2;

        while (t1!=null && t2!=null){
            if (t1.data< t2.data){
                temp.next=t1;
                temp=temp.next;
                t1=t1.next;
            }else{
                temp.next=t2;
                temp=temp.next;
                t2=t2.next;
            }
        }
        if (t1!=null){
            temp.next=t1;
        }
        if (t2!=null){
            temp.next=t2;
        }
        return d.next;
    }

    static void display(Node head){

        while(head != null){
            System.out.print(head.data + " → ");
            head = head.next;
        }

        System.out.println("null");
    }
    public static void main(String[] args) {
        Node head1 = new Node(10);
        head1.next = new Node(30);
        head1.next.next = new Node(50);

        // Second list
        Node head2 = new Node(20);
        head2.next = new Node(40);
        head2.next.next = new Node(60);

        Node result=merge(head1,head2);
        display(result);
    }
}
