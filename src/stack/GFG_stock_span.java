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
    public static void main(String[] args) {
        int[] a={100,80,60,70,60,75,85};
        int[] ans=Stock_span(a);
        System.out.println(Arrays.toString(ans));

    }
}
