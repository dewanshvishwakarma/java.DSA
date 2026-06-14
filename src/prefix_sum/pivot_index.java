package prefix_sum;

public class pivot_index {



    static int pivot(int[] a){
        int total_sum=0;
        for (int i=0;i<a.length;i++){
            total_sum=total_sum+a[i];
        }
        int prefix_sum=0;


        for (int i=0;i<a.length;i++){
            int r_sum=total_sum-prefix_sum-a[i];
            if (prefix_sum==r_sum){
                return i;
            }
        prefix_sum=prefix_sum+a[i];
        }

return -1;
    }
    public static void main(String[] args) {

    }
}
