package prefix_sum;

import java.util.Arrays;

public class exclusive_sum {
    static int[] exclusiveArray(int[] a){
        int n=a.length;
        int[] prefix=new int[n];
        prefix[0]=0;

        for (int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+a[i-1];
        }

        return prefix;
    }


//    exclusive sum without extra space
//    nee d extra variable prev

    static void exclusiveSum(int[] a){
        int n= a.length;
        int prev=0;
        for (int i=0;i<n;i++){
            int current=a[i];
            a[i]=prev;
            prev=prev+current;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 5};
//        int[] ans = exclusiveArray(arr);
//        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < ans.length; i++) {
//            System.out.print(ans[i] + " ");
            exclusiveSum(arr);
        System.out.println(Arrays.toString(arr));

        }
    }

