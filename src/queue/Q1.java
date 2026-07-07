package queue;

public class Q1 {
//    implement queue using array
    int[] a=new int[10];
    int f=-1;
    int r=-1;

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
    public static void main(String[] args) {

    }
}
