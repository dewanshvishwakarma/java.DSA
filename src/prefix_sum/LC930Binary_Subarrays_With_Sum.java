package prefix_sum;

import java.util.HashMap;

public class LC930Binary_Subarrays_With_Sum {
    class Solution {
        public int numSubarraysWithSum(int[] nums, int goal) {
            HashMap<Integer,Integer> map=new HashMap<>();
            map.put(0,1);
            int p=0;
            int r=0;

            for(int i=0;i<nums.length;i++){
                p=p+nums[i];
                int d=p-goal;
                if(map.containsKey(d)){
                    r=r+map.get(d);
                }
                map.put(p,map.getOrDefault(p,0)+1);

            }
            return r;
        }
    }
}
