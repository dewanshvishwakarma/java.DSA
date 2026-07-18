package stack;

import java.util.Arrays;
import java.util.Stack;

public class GFG_stock_span {
    static int[] Stock_span(int[] a){
        int n=a.length;
        Stack<Integer> s=new Stack<>();
        int[] ans=new int[n];

        for (int i=0;i<n;i++){
            while (!s.isEmpty() && a[s.peek()]<=a[i]){
                s.pop();
            }
            if (s.isEmpty()){
                ans[i]=1;
            }else {
                ans[i]=i-s.peek();
            }
            s.push(i);
        }
return ans;
    }

    static int[] Stock_span2(int[] a){
        int n=a.length;
        int[] sol=new int[n];
        Stack<Integer> s=new Stack<>();

        for (int i=0;i<n;i++){
            while (!s.isEmpty() && a[s.peek()]<=a[i]){
                s.pop();
            }
            if (s.isEmpty()){
                sol[i]=1;
            }else{
                sol[i]=i-s.peek();
            }
            s.push(i);
        }
        return sol;
    }
    public static void main(String[] args) {
        int[] a={100,80,90,120};
        int[] ans=Stock_span(a);
        int[] ans2=Stock_span2(a);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(ans2));

    }
}
