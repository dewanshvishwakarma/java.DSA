import java.util.Scanner;

public class SecondLargest {
    static int Find_SecondLargest(int[] a , int n){
        n=a.length;
        int largest=Integer.MIN_VALUE;
        int S_largest=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if (a[i]>largest){
                S_largest=largest;
                largest=a[i];
            }
            else if(a[i]>S_largest && a[i]<largest){
                S_largest=a[i];
            }
        }
        System.out.println("first larget is : "+ largest);
        return S_largest;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of an array :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the "+ n +" elements ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int solution=Find_SecondLargest(arr,n);
        System.out.println("second largest is "+solution);

    }
}
