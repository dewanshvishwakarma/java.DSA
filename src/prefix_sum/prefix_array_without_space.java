package prefix_sum;

import java.util.Arrays;

public class prefix_array_without_space {
    static void  prefixArray(int[] a){
        int n=a.length;
        for (int i=1;i<n;i++){
            a[i]=a[i-1]+a[i];
        }
    }
    public static  void main(String[] args){
        int[] arr={2,1,3,4,5};
        prefixArray(arr);
        System.out.println(Arrays.toString(arr));
}
}

