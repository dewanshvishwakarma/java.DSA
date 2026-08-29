package leetcode;

public class move_zero283 {

    static void move(int[] a){
        int n=a.length;
        int i=0;
        for (int j=0;j<n;j++){
            if(a[j]!=0){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
            }
        }
    }
    static void main(String[] args) {
        int[] a={0,1,0,3,12};
        move(a);;
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
//1 3 12 0 0
    }
}

