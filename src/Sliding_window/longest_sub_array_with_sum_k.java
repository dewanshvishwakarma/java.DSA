package Sliding_window;
//only for positive sub array

public class longest_sub_array_with_sum_k {
    static int longest(int[] a, int k){
        int n=a.length;
        int i=0;
        int sum=0;
        int longest_l=0;

        for (int j=0;j<n;j++){
            sum+=a[j];

            while (sum>k){
                sum-=a[i];
                i++;
            }
            if (sum==k){
                longest_l=Math.max(longest_l,j-i+1);
            }

        }
        return longest_l;
    }
    public static void main(String[] args) {

    }
}
