package leetcode;

public class rotate_array189 {
    static void reverse(int[] a ,int s,int e){
         while (s<e){
             int temp=a[s];
             a[s]=a[e];
             a[e]=temp;
             s++;
             e--;
        }
    }
    static void rotate(int[] a, int k){
        int n=a.length;
        k=k%n;
        reverse(a,0,k);
        reverse(a,k+1,n);
        reverse(a,0,n);
    }

    static void main(String[] args) {
        int[] a={1,2,3,4,5,6};

//        reverse(a,0,3);
        rotate(a,3);
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }

    }
}
