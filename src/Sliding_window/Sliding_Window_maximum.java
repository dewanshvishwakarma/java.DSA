package Sliding_window;
import java.util.ArrayDeque;
import java.util.Deque;

public class Sliding_Window_maximum {

    static int[] printMax(int[] a,int k){
        Deque<Integer> dq=new ArrayDeque<>();
        int n=a.length;
        int[] res=new int[n-k+1];

        if (n==0){
            return res;
        }

        int j=0;
        while (j<k){
            while (!dq.isEmpty() && a[dq.peekLast()]<=a[j]){
                dq.pollLast();
            }
            dq.offerLast(j);
            j++;
        }
        res[0]=a[dq.peekFirst()];
//
//        for (int i=1;i<n-k+1;i++){
//            if (!dq.isEmpty() && dq.peekFirst()<=(i-1)){
//                dq.pollFirst();
//            }
//            while (!dq.isEmpty() && a[dq.peekLast()]<=a[i+k-1]){
//                dq.pollLast();
//            }
//            dq.offerLast(i+k-1);
//            res[i]=a[dq.peekFirst()];
//
//        }

        for (int i=k;i<a.length;i++){
            if (!dq.isEmpty() && dq.peekFirst()<=(i-k)){
                dq.pollFirst();
            }
            while (!dq.isEmpty() && a[dq.peekLast()]<=a[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
            res[i-k+1]=a[dq.peekFirst()];

        }
        return res;
    }

   public static void main(String[] args) {
int[] a={1,3,-1,-3,5,3,6,7};
int[] res=printMax(a,3);
for (int m=0;m< a.length;m++){
    System.out.println(res[m]);
}
    }
}
