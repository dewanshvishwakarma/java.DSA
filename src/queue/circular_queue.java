package queue;

public class circular_queue {
    static int[] a=new int[10];
    int n=a.length;
    static int f=-1;
    static int r=-1;
//     insert an element in circular queue
    void enqueue(int x){
        if (f==-1 && r==-1){
            f=0;
            r=0;
            a[r]=x;
        }
    }
    static void main(String[] args) {

    }
}
