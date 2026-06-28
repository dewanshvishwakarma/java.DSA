package stack;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class next_greater_element {
    static int[] nge(int[] a){
        int n= a.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (a[j]>a[i]){
                    a[i]=a[j];
                    break;
                }
            }

        }
        return a;
    }

    static int[] NGE(int[] a){
        Stack<Integer> st=new Stack<>();
        int n=a.length;
        int[] ans=new int[n];
        for (int i=n-1;i>=0;i--){
            while (!st.isEmpty()){
                x
            }
        }
    }

    public static void main(String[] args) {
        int[] a={6,0,8,1,3};
        int[] ans=nge(a);
        System.out.println(Arrays.toString(ans));
    }
}
