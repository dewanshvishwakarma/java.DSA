package practice;

public class longest_String {
    public static void main(String[] args) {
        String[] arr = {"Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks"};
        int n=arr.length;
        int len=-1;
        int index=-1;
        for(int i=0;i<n;i++){
            String ch=arr[i];
            if (ch.length()>len){
                index=i;
            System.out.println(index);
            }
        }

    }
}
