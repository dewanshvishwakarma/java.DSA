package prefix_sum;
//https://leetcode.com/problems/continuous-subarray-sum/description/
import java.util.HashMap;

public class LC523Continuous_Subarray_um {
    static boolean continuous(int[] a,int k){
        HashMap<Integer,Integer> map =new HashMap<>();
        map.put(0,-1);
        int sum=0;

        for (int i=0;i<a.length;i++){
            sum+=a[i];
            int modulo=sum%k;
            if (map.containsKey(modulo)){
                if (i-map.get(modulo)>=2){
                return true;
                }
            }else{
                map.put(modulo,i);
            }
        }
        return false;
    }
    public static void main(String[] args) {
int[] a={7};
boolean result=continuous(a,6);
        System.out.println(result);
    }
}
