package Linked_list;

public class remove_n_node_last {
    public Node removeNthFromEnd(Node head,int n){
        int len=0;
        Node temp1=head;
        while (temp1!=null){
            len++;
            temp1=temp1.next;
        }
        if (len==n){
            return head.next;
        }
        Node temp=head;

        for (int i=0;i<len-n;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;

    }
}
