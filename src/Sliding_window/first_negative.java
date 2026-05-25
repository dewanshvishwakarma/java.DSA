package Sliding_window;

import java.util.LinkedList;
import java.util.Queue;

public class first_negative {
    static int[] F_negative(int[] a,int k){
        Queue<Integer> queue=new LinkedList<Integer>();
        int n=a.length;
        int index=0;
        while(index<k){
            if (a[index]<0){
                queue.offer(a[index]);
            }
            index++;
        }
        int res[]=new int[n-k+1];
        res[0]=(queue.isEmpty())?0:queue.peek();

        for(int i=1;i<=n-k;i++){
            if (a[i-1]<0){
                queue.poll();
            }
            if (a[i+k-1]<0){
                queue.offer(a[i+k-1]);
            }
            res[i]=(queue.isEmpty())?0:queue.peek();
        }
        return res;
    }
    static void main(String[] args) {
    int[] a={12,-1,-7,8,-15,30,16,28};
    int result[]=F_negative(a,3);
    for (int i=0;i<a.length;i++){
        System.out.println(result[i]);
    }
    }
}
