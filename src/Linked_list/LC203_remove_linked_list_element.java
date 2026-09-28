package Linked_list;

//https://leetcode.com/problems/remove-linked-list-elements/description/
public class LC203_remove_linked_list_element {
    public Node removeElements(Node head, int val){
        Node dummty=new Node(0);
        dummty.next=head;
        Node temp=dummty;

        while (temp.next!=null ){
            if (temp.data==val){
                temp.next=temp.next.next;
            }else {
                temp=temp.next;
            }
        }
        return dummty.next;
    }
}
