package Sliding_window;
//leetcode link=https://leetcode.com/problems/subarray-product-less-than-k/description/
//question are an variable sliding window easy hai take 1 attempt to done


import javax.swing.plaf.IconUIResource;

public class LC713_Subarray_product_less_than_k {
    static int Subarray(int[] a, int k){
        int i=0;
        int count=0;
        long product=1;
        for (int j=0;j<a.length;j++){
            product*=a[j];
            while (product>=k){
                product=product/a[i];
                i++;
            }
            count=count+j-i+1;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] a={10,5,2,6};
        int result=Subarray(a,100);
        System.out.println(result);
    }
}
