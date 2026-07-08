package stack;

import java.util.Arrays;
import java.util.Stack;

public class LC739_daily_temperature {
//    we have to given an array of temperature of an days and we find to find the
//    gap between the next greater temperature

    static int[] dailyTemperatures(int[] a){
        Stack<Integer> s=new Stack<>();
        int n=a.length;
        int[] ans=new int[n];

        for (int i=n-1;i>=0;i--){
            while (!s.isEmpty() && a[s.peek()]<=a[i]){
                s.pop();
            }
            if (s.isEmpty()){
                ans[i]=0;
            }else {
                ans[i]=s.peek()-i;
            }
            s.push(i);
        }
        return ans ;
    }

    public static void main(String[] args) {
        int[] a={73,74,75,71,69,72,76,73};
        int[] ans=dailyTemperatures(a);
        System.out.println(Arrays.toString(ans));
    }
}
