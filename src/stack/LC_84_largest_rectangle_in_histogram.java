package stack;

import java.util.Stack;
//https://leetcode.com/problems/largest-rectangle-in-histogram/
public class LC_84_largest_rectangle_in_histogram {
    static int largestRectangleArea(int[] arr){
        Stack<Integer> s=new Stack<>();
        int n=arr.length;
        int[] NSL=new int[n];
        int[] NSR=new int[n];
        int max_area=0;
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                NSR[i]=n;
            }else{
                NSR[i]=s.peek();
            }
            s.push(i);
        }
        s.clear();

// NSL
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && arr[s.peek()]>arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                NSL[i]=-1;
            }else{
                NSL[i]=s.peek();
            }
            s.push(i);
        }
        for (int i=0;i<n;i++){
             int w=NSR[i]-NSL[i]-1;
            int area=arr[i]*w;
            max_area=Math.max(max_area,area);
        }
return max_area;

    }

    public static void main(String[] args) {
    }
}
