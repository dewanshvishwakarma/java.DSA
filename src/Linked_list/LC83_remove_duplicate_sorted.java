package Linked_list;

public class LC83_remove_duplicate_sorted {
    static Node remove(Node head){
        Node temp=head;
        if (head==null || head.next==null){
            return head;
        }
        while (temp!=null && temp.next!=null){
            if (temp.data==temp.next.data){
                temp.next=temp.next.next;
            }else {
                temp=temp.next;
            }
        }
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
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(20);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(30);
        head.next.next.next.next.next = new Node(40);
        head.next.next.next.next.next.next = new Node(40);

        System.out.println("Before:");
        display(head);

        head = remove(head);

        System.out.println("After:");
        display(head);
    }
}
