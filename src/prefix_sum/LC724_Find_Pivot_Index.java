package prefix_sum;
//link= https://leetcode.com/problems/find-pivot-index/description/
public class LC724_Find_Pivot_Index {



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
int[] a={1,7,3,6,5,6};
int r=pivot(a);
        System.out.println(r);
    }
}
