package CLL;

public class insert_at_beg {
    static void display(Node head){
        if (head==null){
            return;
        }
        Node temp=head;
        do{
            System.out.println(temp.data + " ");
            temp=temp.next;
        }while (temp!=head);
        System.out.println();
    }


    static Node Insert_beg(Node head,int data){
        Node newNode=new Node(data);
        if (head==null){
            newNode.next=newNode;
            return newNode;
        }

        Node temp=head;
        while (temp.next!=head){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.next=head;
        head=newNode;
        return head;
    }

    public static void main(String[] args) {
        Node head=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        head.next=b;
        b.next=c;
        c.next=head;

        Node h=Insert_beg(head,500);
        display(h);
        System.out.println(c.next.data);
    }
}
