package Linked_list;

public class reorder_list143 {
    public void reorderList(Node head){
        Node f=head;
        Node s=head;
        while (f!=null && f.next!=null){
            f=f.next.next;
            s=s.next;
        }
        Node head2=s.next;
        s.next=null;

        Node pre=null;
        Node curr=head2;

        while (curr!=null){
            Node n=curr.next;
            curr.next=pre;
            pre=curr;
            curr=n;
        }
        Node p1=head;
        Node p2=head2;
        while (p2!=null){
            Node t1=p1.next;
            Node t2=p2.next;

            p1.next=p2
            p2.next=t1;
            p1=t1;

        }
    }
    public static void main(String[] args){

    }
}
