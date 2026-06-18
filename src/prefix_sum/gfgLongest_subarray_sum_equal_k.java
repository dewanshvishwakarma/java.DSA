package prefix_sum;
//https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1
import java.util.HashMap;

public class gfgLongest_subarray_sum_equal_k {
    static int Sub(int[] a, int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int prefix=0;
        int result=0;
        for (int i=0;i<a.length;i++){
            prefix=prefix+a[i];
            int dif=prefix-k;

            if (map.containsKey(dif)){
               result= Math.max(result,i-map.get(dif));
            }
            if (!map.containsKey(prefix)) {
                map.put(prefix,i);
            }

        }
        return result;
    }
    public static void main(String[] args) {
        int[] a={-1,-1,1,-1,-1,-1,1,1};
        int r=Sub(a,0);
        System.out.println(r);
    }
}
