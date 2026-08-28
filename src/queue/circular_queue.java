package queue;

public class circular_queue {
    static int[] a=new int[3];
    int n=a.length;
    static int f=-1;
    static int r=-1;
//     insert an element in circular queue
    void enqueue(int x){
        if (f==-1 && r==-1){
            f=0;
            r=0;
            a[r]=x;
        }else if ((r+1)%n==f){
            System.out.println("overflow");
            return;
        }
        else{
            r=(r+1)%n;
            a[r]=x;
        }
    }

    static void dequeue(){
        if(f==-1 && r==-1){
            System.out.println("queue is empty right");
        }
       else if(f==r){
            r=-1;f=-1;
        }
       else {
           f++;
        }
    }
    static void display(){
        if (f==-1 && r==-1){
            return;
        }else{
            for (int i=f;i<r+1;i++){
                System.out.println(a[i] + " ");
            }
            System.out.println();
        }
    }
    static void main(String[] args) {
        circular_queue q=new circular_queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        display();
    }
}
