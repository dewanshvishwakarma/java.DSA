
package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Count_pair_less_than_target {
    static int Count_pair(List<Integer> arr,int target){
        Collections.sort(arr);
        int n= arr.size();
        int count=0;
        int l=0;
        int r=n-1;
        while(l<r){
            if (arr.get(l)+arr.get(r)<target){
                count =count+(r-l);
                l++;
            }else{
                r--;
            }
        }
        return count;
    }
   public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        arr.add(-6);
        arr.add(2);
        arr.add(5);
        arr.add(-2);
        arr.add(-7);
        arr.add(-1);
        arr.add(3);

        int target = -2;

        int result = Count_pair(arr, target);

        System.out.println("Number of pairs: " + result);
    }
}
