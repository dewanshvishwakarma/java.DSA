package leetcode;

import java.util.HashSet;

public class contain_duplicate217 {
    static boolean dulicate(int[] a){
        HashSet<Integer> set=new HashSet<>();
        int n=a.length;
        for(int i=0;i<n;i++){
            if (set.contains(a[i])){
                return true;
            }else{
                set.add(a[i]);
            }

        }
        return false;
    }


    static void main(String[] args) {
        int[] a={1,2,3,2,2,2,2,2,2,2};
        boolean result=dulicate(a);
        System.out.println(result);
    }
}
