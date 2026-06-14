package prefix_sum;

import java.lang.reflect.Array;
import java.util.Arrays;

public class suffix_sum {
//    with extra space
    static int[] Suffix_sum(int[] a){
        int n=a.length;
        int[] s_sum=new int[n];
        s_sum[n-1]=a[n-1];

        for (int i=n-2;i>=0;i--){
           s_sum[i]=s_sum[i+1]+a[i];
        }

        return s_sum;
    }


//    without extra space

    static void Sum(int[] a){
        int n=a.length;

        for (int i=n-2;i>=0;i--){
            a[i]=a[i]+a[i+1];
        }
    }

    public static void main(String[] args){
int[] a={2, 4, 3, 2, 1};
int[] r=Suffix_sum(a);
        System.out.println(Arrays.toString(r));


int[] a1={1,2,3,5,6};
Sum(a1);
        System.out.println(Arrays.toString(a1));
    }
}
