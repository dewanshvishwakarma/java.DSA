package Linked_list;

public class remove_cycle {
    public static void removeCycle(Node head){
        Node fast=head;
        Node slow=head;
//check cycle
        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if (slow==fast){
                break;
            }
        }
        //if not found
        if (fast==null || fast.next==null){
            return;
        }
        // stating point of cycle
        slow=head;
        while (slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
//        temp with slow back
        Node temp=slow;
        while (temp.next!=slow){
            temp=temp.next;
        }

//        break the cycle
        temp.next=null;
    }
    public static void main(String[] args){

    }
}
