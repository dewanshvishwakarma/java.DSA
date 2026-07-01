package stack;

import java.util.Arrays;
import java.util.Stack;

public class left_smaller {
    static int[] NSL(int[] a){
        Stack<Integer> s=new Stack<>();
        int n=a.length;
        int[] ans=new int[n];
        for (int i=0;i<n;i++){
            while (!s.isEmpty() && s.peek()>=a[i]){
                s.pop();
            }
            if (s.empty()){
                ans[i]=-1;
            }else {
                ans[i]=s.peek();
            }
            s.push(a[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a={4,5,2,10,8};
        int[] ans=NSL(a);
        System.out.println(Arrays.toString(ans));
    }
}
