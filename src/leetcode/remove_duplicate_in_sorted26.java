package leetcode;

public class remove_duplicate_in_sorted26 {
//    two pointer approach
    static int remove(int[] a){
        int n=a.length;
        int i=0;;
        for (int j=0;j<n;j++){
            if (a[j]!=a[i]){
                i++;
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        return i+1;
    }
    static void main(String[] args) {
        int[] a={0,0,1,1,1,2,2,3,3,4};
        int[] b={1,1,2};
        int r1=remove(b);
        int r=remove(a);
        System.out.println(r);
        System.out.println(r1);
    }
}
