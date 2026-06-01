package Sliding_window;

public class LC2302_Count_sub_array_with_score_less_than_k {
    public long countSubarrays(int[] a, long k){
        long result=0;
        long sum=0;
        int j=0;

        for (int i=0;i<a.length;i++){
            sum+=a[i];
            while (sum*(i-j+1L)>=k){
                sum-=a[j];
                j++;
            }
            result=result+(i-j+1);
        }
        return result;
    }

    static void main(String[] args) {

    }
}
