package Linked_list;

public class gfgRemove_n_from_end {
    static Node remove(Node head, int k){
        Node temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }

        Node t=head;
        int pos=len-k+1;
        for (int i=1;i<pos-1;i++){
            t=t.next;
        }
        t.next=t.next.next;

        return head;
    }

    static void display(Node head){

        while(head != null){
            System.out.print(head.data + " → ");
            head = head.next;
        }

        System.out.println("null");
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        head.next=b;
        b.next=c;
        c.next=d;
        head=remove(head,2);
        display(head);
    }
}
