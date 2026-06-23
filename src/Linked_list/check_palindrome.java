package Linked_list;

import static Linked_list.LL4.display;

public class check_palindrome {
    static boolean check(Node head){
        if (head==null || head.next==null){
            return true;
        }

        Node s=head;
        Node f=head;

        while (f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }

        Node c=s;
        Node n=null;
        Node p=null;
        while (c!=null){
            n=c.next;
            c.next=p;
            p=c;
            c=n;
        }
        Node r=p;
        Node l=head;
        while (r!=null){
            if (l.data!=r.data){
                return false;
            }
            l=l.next;
            r=r.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        System.out.println("List:");
        display(head);

        boolean ans = check(head);

        System.out.println("Is Palindrome? " + ans);
    }
}
