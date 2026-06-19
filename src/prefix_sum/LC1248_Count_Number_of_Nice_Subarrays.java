package prefix_sum;
//https://leetcode.com/problems/count-number-of-nice-subarrays/
import java.util.HashMap;

public class LC1248_Count_Number_of_Nice_Subarrays {
    static int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                nums[i]=0;
            }else{
                nums[i]=1;
            }
        }
        int sum=0;
        int p=0;
        int r=0;
        for(int i=0;i<nums.length;i++){
            p=p+nums[i];
            int dif=p-k;
            if(map.containsKey(dif)){
                r=r+map.get(dif);
            }
            map.put(p,map.getOrDefault(p,0)+1);

        }
        return r;
    }

    public static void main(String[] args) {
        int[] a={1,1,2,1,1};
        int r=numberOfSubarrays(a,3);

    }
}
