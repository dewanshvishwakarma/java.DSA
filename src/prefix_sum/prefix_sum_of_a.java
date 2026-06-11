package prefix_sum;

import java.util.Arrays;

//make prefix sum of an array an of size N
//in this method we make prefix array of extra space that is prefix array


public class prefix_sum_of_a {
    static int[] prefixArray(int[] a){
        int[] result= new int[a.length];
        result[0]=a[0];


        for (int i=1;i<a.length;i++){
            result[i]=result[i-1]+a[i];
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr={2,1,3,4,5};
        int[] ans=prefixArray(arr);
        System.out.println(Arrays.toString(arr));
        for (int i=0;i<ans.length;i++){
            System.out.print(ans[i]+ " ");
        }
    }
}
