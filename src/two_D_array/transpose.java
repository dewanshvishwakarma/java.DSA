package two_D_array;

import java.util.Scanner;
//wap to teanspose the 2d array using the for loop
public class transpose {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n= sc.nextInt();
        int[][] a=new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
//transpose
     for(int i=0;i<n;i++){
         for (int j=0;j<m;j++){
             System.out.print(a[j][i]);
         }
         System.out.println();
     }
    }
}
