package Linked_list;

public class Intersection_in_linklist {

   static int length(Node head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
    static Node intersection(Node headA, Node headB){
        Node t1=headA;
        Node t2=headB;

        int lenA=length(headA);
        int lenB=length(headB);
        int dif=Math.abs(lenA-lenB);

        if (lenA>lenB){
            while (dif>0){
                t1=t1.next;
                dif--;
            }
        }else {
            while (dif>0){
                t2=t2.next;
                dif--;
            }
        }

        while (t1!=null && t2!=null){
            if (t1==t2){
                return t1;
            }
            t1=t1.next;
            t2=t2.next;
        }
return null;
    }

    public static void main(String[] args) {
        Node common = new Node(40);
        common.next = new Node(50);

        Node head1 = new Node(10);
        head1.next = new Node(20);
        head1.next.next = new Node(30);
        head1.next.next.next = common;

        Node head2 = new Node(15);
        head2.next = common;

        Node ans = intersection(head1, head2);
        System.out.println(ans.data);

    }
}
