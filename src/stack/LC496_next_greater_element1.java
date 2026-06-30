package stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
//https://leetcode.com/problems/next-greater-element-i/
public class LC496_next_greater_element1 {
    static int[]  nextGreaterElement(int[] a,int[] b){
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> s=new Stack<>();
        int m=a.length;
        int n=b.length;

        for (int i=n-1;i>=0;i--){
            while (!s.isEmpty() && b[i]>=s.peek()){
                s.pop();
            }
            if (s.isEmpty()){
                map.put(b[i],-1);
            }else {
                map.put(b[i],s.peek());
            }
            s.push(b[i]);
        }
        int[] ans=new int[m];
        for (int i=0;i<m;i++){
            if (map.containsKey(a[i])){
                ans[i]= map.get(a[i]);
            }
        }
return ans;
    }
    public static void main(String[] args) {
int[] a={4,1,2};
int[] b={1,3,4,2};
int[] ans=nextGreaterElement(a,b);
        System.out.println(Arrays.toString(ans));
    }
}
