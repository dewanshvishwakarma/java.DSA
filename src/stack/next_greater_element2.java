package stack;

import java.util.Arrays;
import java.util.Stack;
//https://leetcode.com/problems/next-greater-element-ii/description/
public class next_greater_element2 {
    static int[] nextGreaterElement(int[] a, int[] b){
        int m=a.length;
        int n=b.length;
        int[] ans=new int[m];

        //search element index at array b
        for ( int i=0;i<m;i++){
            int index=-1;
            for (int j=0;j<n;j++){
                if(a[i]==b[j]){
                    index=j;
                    break;
                }
            }
            ans[i]=-1;
            for (int j=index+1;j<n;j++){
                if (b[j]>a[i]){
                    ans[i]=b[j];
                    break;
                }
            }

        }
return ans;
    }

//    Time = O(m*n)
//    Space = O(1)

// solve using Stack
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
//    Time = O(m+n)
//    Space = O(n)
    public static void main(String[] args) {
        int[] a={4,1,2};
        int[ ] b={1,3,4,2};
        int[] ans=nextGreaterElement(a,b);
        System.out.println(Arrays.toString(ans));
    }
}
