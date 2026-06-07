package Sliding_window;

public class LC1004_max_consecutive_once_iii {
    static  int MaxConsecutive(int[] a, int k){
        int zero=0;
        int i=0;
        int count=0;
        for(int j=0;j<a.length;j++){
            if (a[j]==0){
                zero++;
            }

            while (zero>k){
                if (a[i]==0){
                    zero--;
                }
                i++;
            }
            count=Math.max(count,j-i+1);
        }
        return count;
    }
    public static void main(String[] args) {
int[] a={1,1,1,0,0,0,1,1,1,1,0};
int result=MaxConsecutive(a,2);
        System.out.println(result);
    }
}
