package stack;

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
    public static void main(String[] args) {

    }
}
