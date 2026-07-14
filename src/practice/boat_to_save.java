package practice;

public class boat_to_save {
    static int  save(int[] a , int limit){
       int  boat=0;
       int i=0;
       int j=a.length-1;

       while(i<=j){
           if(a[i]+a[j]<=limit){
               boat++;
               i++;
               j--;
           }else {
               boat++;
               j--;
           }
       }
       return boat;
    }
    static void main(String[] args) {
        int[] a={3,5,5,4};
        int result=save(a,5);
        System.out.println(result);
    }
}
