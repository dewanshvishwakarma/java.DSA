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
        for(int i=n-1;i>=0;i--){
            while (st.size()>0 && st.peek()<=a[i]) {
                st.pop();
            }
                if (st.isEmpty()){
                    ans[i]=-1;
                }else{
                    ans[i]=st.peek();
                }
                st.push(a[i]);

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a={6,8,0,1,3};
        int[] ans=NGE(a);
        System.out.println(Arrays.toString(ans));
    }
}
