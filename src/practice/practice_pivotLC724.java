package practice;

public class practice_pivotLC724 {
    static int pivot(int[] a){
        int p=0;
        int n=a.length;
        int total=0;
        int r;
        for (int i=0;i<n;i++){
            total+=a[i];
        }

        for (int i=0;i<n;i++){
            r=total-p-a[i];
            if (r==p){
                return i;
            }
            p=p+a[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a={1,7,3,6,5,6};
        int r=pivot(a);
        System.out.println(r);
    }
}
