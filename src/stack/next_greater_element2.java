package stack;

import java.util.Stack;

public class next_greater_element2 {
    static int[] NGE2(int [] a){
        int n=a.length;
        int[] ans=new int[n];
        Stack<Integer> s=new Stack<>();
        for (int i=2*n-1;i>=0;i--){
            int c=a[i%n];
            while (!s.isEmpty() && s.peek()<=c){
                s.pop();
            }
            if(i<n){
                if (s.isEmpty()){
                    ans[i]=-1;
                }else {
                    ans[i]=s.peek();
                }
            }
            s.push(c);
        }
        return ans;
    }
}
