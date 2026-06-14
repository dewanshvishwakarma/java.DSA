package prefix_sum;

public class range_sum_query {

    static void prefixArray(int[] a) {
        for (int i = 1; i < a.length; i++) {
            a[i] += a[i - 1];
        }
    }

    static int sumLR(int[] prefix, int l, int r) {
        if (l == 0) {
            return prefix[r];
        }

        return prefix[r] - prefix[l - 1];
    }

    public static void main(String[] args) {

        int[] a = {2, 4, 3, 2, 1};

        prefixArray(a);   // build once

        System.out.println(sumLR(a, 0, 3)); // 11
        System.out.println(sumLR(a, 1, 4)); // 10
    }
}