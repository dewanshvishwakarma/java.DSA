package practice;

import java.util.HashMap;

public class LC560_sum_equal_to_k {
    static int Sum(int[] a, int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int r=0;
        int n=a.length;
        int p=0;
        for(int i=0;i<n;i++){
            p=p+a[i];
            int dif=p-k;
            if (map.containsKey(dif)){
                r=r+map.get(dif);
            }
            map.put(p, map.getOrDefault(p,0)+1);
        }
        return r;
    }
    public static void main(String[] args) {
        int[] a={1,2,3};
        int r=Sum(a,3);
        System.out.println(r);
    }
}
