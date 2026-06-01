package Sliding_window;

public class gfg_Smallest_subarray_with_sum_greater_than_x {
    static int  smallestSubWithSum(int x,int[] a){
        int sum=0;
        int l=0;
        int j=0;
        for(int i=0;i< a.length;i++){
            sum=sum+a[i];

            while (sum>x){
                l=Math.max(l,i-j+1);

                sum=sum-a[j];
                j++;
            }



        }
        return l;
    }
    static void main(String[] args) {

    }
}
