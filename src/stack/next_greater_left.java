package stack;

import java.util.Arrays;
import java.util.Stack;

public class next_greater_left {
    static int[] NGL(int[] a){
        Stack<Integer> s=new Stack<>();
        int n=a.length;
        int[] ans=new int[n];
        for (int i=0;i<n;i++){
            while (!s.isEmpty() && s.peek()<=a[i]){
                s.pop();
            }
            if (s.isEmpty()){
                ans[i]=-1;
            }else{
                ans[i]=s.peek();
            }
            s.push(a[i]);
        }
        return ans ;
    }

    public static void main(String[] args) {

    int [] a={1,5,4,86,2,14,7};
        int [] ans=NGL(a);
        System.out.println(Arrays.toString(ans));
    }

}
