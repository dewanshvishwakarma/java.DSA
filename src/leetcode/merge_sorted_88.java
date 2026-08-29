package leetcode;

public class merge_sorted_88 {
//    solve first using an extra space int[] result(array)
    static int[]  merge(int[] a,int[] b){
        int m=a.length;
        int n=b.length;
        int[] result=new int[m+n];
        int k=0;
        int i=0;
        int j=0;
        while (i<m && j<n){
            if (a[i]<=b[j]){
                result[k]=b[i];
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
//    now solve without extra space

    static void merge2(int[] a,int[] b, int m,int n){
        int k=(m+n)-1;
        int i=m-1;
        int j=n-1;
        while (i>=0 && j>=0){
            if(a[i]<=b[j]){
                a[k]=b[j];
                k--;
                j--;
            }else{
                a[k]=a[i];
                k--;
                i--;
            }
        }
        while(j>=0){
            a[k]=b[j];
            k--;
            j--;
        }
    }
    static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={1,2,2};
        int[] A={1,2,3,0,0,0};
        int[] B={2,5,6};
//        int[] r=merge(a,b);
//        for (int i=0;i<r.length;i++){
//            System.out.print(r[i] + " ");//1 1 2 2 2 3
//        }
        merge2(a,b,3,3);
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]+ " ");
        }
    }
}
