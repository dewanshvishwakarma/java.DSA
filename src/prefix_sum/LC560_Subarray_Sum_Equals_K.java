package prefix_sum;

import java.util.HashMap;

public class LC560_Subarray_Sum_Equals_K {

    static int sub_array(int[] a,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        int prefix_sum=0;
        map.put(0,1);
        for (int i=0;i<a.length;i++){
            prefix_sum=prefix_sum+a[i];
            int dif=prefix_sum-k;

            if (map.containsKey(dif)){
                count=count+map.get(dif);
            }
            map.put(prefix_sum,map.getOrDefault(prefix_sum,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
