import java.util.Scanner;
public class SumOfArray {

    static int[] takeInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of  array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the " + n +" elements :");
        for (int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    static void print(int[] a){
        int start = 0;
        if(a[0] == 0){
            start = 1;
        }
        for(int i = start; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void SumOfTwoArray(int[] arr1,int[] arr2,int[] output){
        int i= arr1.length-1;
        int j= arr2.length-1;
        int k= output.length-1;
        int c=0;
        while (j>=0 && i>=0){
            int sum=arr1[i]+arr2[j]+c;
            output[k]=sum%10;
            c=sum/10;
            i--;
            k--;
            j--;
        }
        while (i>=0){
            int sum=arr1[i]+c;
            output[k]=sum%10;
            c=sum/10;
            i--;
            k--;
        }
        while (j>=0){
            int sum=arr2[j]+c;
            output[k]=sum%10;
            c=sum/10;
            j--;
            k--;
        }
        if (c>0){
            output[0]=c;}
    }
    public static void main(String[] args){
        int[] arr1=takeInput();
        int[] arr2=takeInput();
        int[] output=new int[1+ Math.max(arr1.length, arr2.length)];
        System.out.println("sum of array is : ");
        SumOfTwoArray(arr1,arr2,output);
        print(output);
    }
}