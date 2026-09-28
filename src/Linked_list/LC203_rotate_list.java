package Linked_list;

public class LC203_rotate_list {
    public int length(Node head){
        Node temp=head;
        int count=0;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public Node rotate(Node head,int k){

        if(k==0){
            return head;
        }
        int l=length(head);
        k=k%l;
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;

        int i=1;
        Node temp2=head;
        while (i<l-k){
            temp2=temp2.next;
            i++;
        }

        head=temp2.next;
        temp2.next=null;
return head;
    }
}
