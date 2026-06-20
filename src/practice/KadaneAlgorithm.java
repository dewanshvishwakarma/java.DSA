package practice;

public class KadaneAlgorithm {
    static int Kadane(int[] a){
        int n= a.length;
        int maxSum=a[0];
        int currentSum=0;
        for (int i=0;i<n;i++) {
            currentSum = currentSum + a[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args){
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int output=Kadane(arr);
        System.out.println(output);
    }
}
