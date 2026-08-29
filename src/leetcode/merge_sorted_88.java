package leetcode;

public class merge_sorted_88 {
    static int[]  merge(int[] a,int[] b){
        int m=a.length;
        int n=b.length;
        int[] result=new int[m+n];
        int k=0;
        int i=0;
        int j=0;
        while (i<m && j<n){
            if (a[i]<=b[j]){
                result[k]=a[i];
                k++;
                i++;
            }else {
                result[k]=b[j];
                j++;
                k++;
            }
        }

        while (i < a.length) {
            result[k] = a[i];
            i++;
            k++;
        }

        // Remaining elements of b
        while (j < b.length) {
            result[k] = b[j];
            j++;
            k++;
        }
return result;

    }
    static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={1,2,2};
        int[] r=merge(a,b);
        for (int i=0;i<r.length;i++){
            System.out.print(r[i] + " ");//1 1 2 2 2 3
        }
    }
}
