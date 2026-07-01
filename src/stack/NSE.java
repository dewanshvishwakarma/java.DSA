package stack;

import java.util.Arrays;
import java.util.Stack;
//gfg=https://www.geeksforgeeks.org/problems/immediate-smaller-element1142/1
public class NSE {
    static int[] next_smaller(int[] a){
    Stack<Integer> s=new Stack<>();
    int n= a.length;
    int[] ans=new int[n];
    for (int i=n-1;i>=0;i--){
        while (!s.isEmpty() && s.peek()>=a[i]){
            s.pop();
        }
        if (s.isEmpty()){
            ans[i]=-1;
        }else {
            ans[i]=s.peek();
        }
        s.push(a[i]);
    }
    return ans;
    }
    public static void main(String[] args) {
        int[] a={4, 8, 5, 2, 25};
        int[] ans=next_smaller(a);
        System.out.println(Arrays.toString(ans));
    }
}
