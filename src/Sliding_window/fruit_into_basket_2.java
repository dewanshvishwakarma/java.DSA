package Sliding_window;

import java.util.HashMap;

public class fruit_into_basket_2 {
    static int basket2(int[] a){
        HashMap<Integer,Integer> map=new HashMap<>();

        int i=0;
        int j=0;
        int count=0;
        int n=a.length;

        while (j<n){
            map.put(a[j], map.getOrDefault(a[j], 0) + 1);

            if (map.size()<=2){
                count=Math.max(count,j-i+1);
            }else{
                map.put(a[i], map.get(a[i]) - 1);

                if (map.get(a[i])==0){
                    map.remove(a[i]);
                }
                i++;
            }
            j++;
        }
        return count;
    }
    public static void main(String[] args) {
int[] a={1,2,3,2,2};
int result=basket2(a);
        System.out.println(result);
    }
}
