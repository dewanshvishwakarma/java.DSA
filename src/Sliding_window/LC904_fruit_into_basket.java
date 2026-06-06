package Sliding_window;

import java.util.HashMap;

public class LC904_fruit_into_basket {
    static int basket(int[] a){
        HashMap<Integer,Integer> map=new HashMap<>();

        int max=0;
        int i=0;

        for (int j=0;j<a.length;j++){
            map.put(a[j], map.getOrDefault(a[j],0)+1);

            while (map.size()>2){
                map.put(a[i],map.get(a[i])-1);

                if (map.get(a[i])==0){
                    map.remove(a[i]);
                }
                i++;
            }

            max=Math.max(max,j-i+1);
        }
        return max;
    }
    public static void main(String[] args) {
int[] a={1,2,3,2,2};
int result=basket(a);
        System.out.println(result);
    }
}
