package Linked_list;

public class LC_86_partition_list {
    public Node partition(Node head, int val){
        Node d1=new Node(0);
        Node d2=new Node(0);
        Node p1=d1;
        Node p2=d2;

        Node temp=head;
        while (temp!=null){
            Node n=temp.next;
            if (temp.data>=val){
                p2.next=temp;
                p2=p2.next;
                temp=n;
            }else{
                p1.next=temp;
                p1=p1.next;
                temp=n;
            }
        }
        p1.next=d2.next;
        return d1.next;
    }
    public static  void main(String[] args){

    }
}
