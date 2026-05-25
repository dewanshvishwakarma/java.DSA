package Sliding_window;

import java.util.ArrayList;
import java.util.HashMap;

public class distinct_window {
    static void distinct(int[] a,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=a.length;

        for (int i=0;i<k;i++){
            if (map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
            }
            else {
                map.put(a[i],1);
            }
        }
        System.out.print(map.size() + " ");

        for (int i=k;i< a.length;i++){
                if (map.get(a[i-k])==1){
                    map.remove(a[i-k]);
                }else {
                    map.put(a[i - k], map.get(a[i - k]) - 1);
                }

            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
             System.out.print(map.size() + " ");

        }
    }



//    with Array list

    static ArrayList<Integer> countDistinct(int a[], int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=0;i<k;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        ans.add(map.size());


        for(int i=k;i<a.length;i++){
            if (map.get(a[i-k])==1){
                map.remove(a[i-k]);
            }else {
                map.put(a[i-k], map.get(a[i-k])-1);
            }

            map.put(a[i],map.getOrDefault(a[i],0)+1);
            ans.add(map.size());
        }
        return ans;
    }

    static void main(String[] args) {
        int[] a={1, 2, 1, 3, 4, 2, 3};
        distinct(a,4);
        ArrayList<Integer>  ans=countDistinct(a,4);
        for (int j=0;j< ans.size();j++){
            System.out.println(ans.get(j));
        }




    }
}
