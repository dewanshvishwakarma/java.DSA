package TWO_POINTER;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LC350_intersection_of_two_array {
    static int[] intersection(int[] a,int[] b){
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0;
        int j=0;
        int k=0;

        while (i<a.length && j< b.length){
            if(a[i]==b[j]){
                a[k]=a[i];
                i++;
                j++;
                k++;
            }else {
                if(a[i]!=a[j] && a[i]>b[j]){
                    j++;
                }else{
                    i++;
                }
            }
        }
        return Arrays.copyOfRange(a,0,k);


    }
    static void main(String[] args) {
int[] a={4,9,5};
int[] b={9,4,9,8,4};

int[] r=intersection(a,b);
for (int i=0;i<r.length;i++){
    System.out.println(r[i] + " ");
}
    }
}
