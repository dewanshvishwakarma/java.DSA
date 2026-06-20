package prefix_sum;

import java.util.HashSet;

public class gfg_sub_array_sum_equal_to_0 {
    static boolean findSum(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        set.add(0);
        int p=0;
        for (int i=0;i< arr.length;i++){
            p=p+arr[i];

            if (set.contains(p)){
                return true;
            }
            set.add(p);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a={4, 2, -3, 1, 6};
        boolean r=findSum(a);
        System.out.println(r);
    }
}
