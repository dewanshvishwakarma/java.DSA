package Sliding_window;
//gfg=https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1

public class gfg_Max_Sum_Subarray_of_size_K {
    static int S_window(int[] a,int k){
        int n= a.length;
        int w_sum=0;
        int max_sum=0;

        for (int i=0;i<k;i++){
            w_sum=w_sum+a[i];
        }
            max_sum=w_sum;

        for (int i=k;i<n;i++){
            w_sum=w_sum-a[i-k]+a[i];
            max_sum=Math.max(w_sum,max_sum);
        }
        return max_sum;
    }
   public static void main(String[] args) {
        int[] a={2,9,31,-4,21,7};
        int result=S_window(a,3);
        System.out.println("max sub array :" + result);


    }
}
