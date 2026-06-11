package prefix_sum;

import java.util.Arrays;

// find sum of l to r
public class range_sum_quarry {
    static void prefixArray(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            a[i] = a[i - 1] + a[i];
        }
    }
        static int sumLR ( int[] a, int l, int r){
                prefixArray(a);

                if (l==0){
                    return a[r];
                }else{
                int sum=a[r]-a[l-1];
                return sum;
                }
        }
        public static void main (String[]args){
        int[] a={2,4,3,2,1};
        int result=sumLR(a,0,3);
            System.out.println(result);
        }
}