package practice;

public class DuplicateZero {
    public static void main(String[] args) {
        int[] a = {1, 0, 2, 3, 0, 4, 5, 0};
//        int[] result=new int[12];
//        int j=0;
//        for (int i=0;i<a.length;i++){
//            if (a[i]!=0){
//                result[j++]=a[i];
//            }
//            else if (a[i]==0){
//                result[j++]=0;
//                result[j++]=0;
//            }
//        }
//
//        for (int i=0;i< result.length;i++){
//            System.out.print(result[i] + " ");
//        }


        int pz=0;
        int n= a.length;
        for (int i=0;i< a.length;i++){
            if (a[i]==0){
                pz++;
                n=n-pz;
            }
        }
        int j=0;
        int[] result=new int[pz];
        for (int i=pz;i>=0;i--){
            if (a[i]!=0){
                result[j--]=a[i];
            } else if (a[i]==0) {
                result[j--]=a[i];
                result[j--]=a[i];
            }
        }
        for (int i=0;i< result.length;i++){
            System.out.print(result[i] + " ");
        }
    }
}
