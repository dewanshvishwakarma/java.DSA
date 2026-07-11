package stack;

import java.util.Stack;

public class LC907_Sum_of_Subarray_Minimums {
//    brute force
//Start from index i.
//    Extend the subarray till index j.
//    Keep updating the minimum element.
//    Add the minimum to the final answer.
    static int sumOfSubarray(int[] a){
        int sum=0;
        for (int i=0;i<a.length;i++){
            int min=a[i];
            for (int j=i;j< a.length;j++){
                min=Math.min(min,a[j]);
                sum+=min;
            }
        }
        return sum;
    }

    static int sumOfSubarray2(int[] arr){
        int n=arr.length;
        Stack<Integer> s=new Stack<>();
        int[] NSR=new int[n];
        int[] NSL=new int[n];
        int sum=0;
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

        for(int i=0;i<n;i++){
            int left=i-NSL[i];
            int right=NSR[i]-i;
            int totalWays=left*right;
            int totalsum=arr[i]*totalWays;
            sum=(sum+totalsum);
        }
        return sum;


    }
    public static void main(String[] args) {
int[] a={3,1,2,4};
int sol=sumOfSubarray2(a);
        System.out.println(sol);

    }
}
