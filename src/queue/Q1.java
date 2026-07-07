package queue;

public class Q1 {
//    implement queue using array
   static int[] a=new int[10];
   static int f=-1;
   static int r=-1;

     void enqueue(int x){
         if (r==a.length-1){
             System.out.println("queue id overflow");
         } else if(f==-1 && r==-1){
            f=0;
            r=0;
            a[r]=x;
        }else {
             r++;
             a[r] = x;
         }
    }

    static void dequeue(){
         if (f==-1 && r==-1 ) {
             System.out.println("queue is empty");
             return;
         } else if (f==r) {
             r=-1;
             f=-1;
         }else {
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


    static void peek(){
         if (f==-1&& r==-1){
             return;
         }else {
             System.out.println(a[f]);
         }
     }
    public static void main(String[] args) {
         Q1 q=new Q1();
         q.enqueue(10);
         q.enqueue(20);
         q.enqueue(30);
         q.enqueue(40);

        display();

        dequeue();
        dequeue();
        display();
        peek();


    }
}
