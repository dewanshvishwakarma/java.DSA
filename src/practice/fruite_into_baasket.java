package practice;

import java.util.HashMap;

public class fruite_into_baasket {

static void busket(int[] a){
    HashMap<Integer,Integer> map=new HashMap<>();

    int i=0;
    int len=0;

    for (int j=0;i<a.length;j++){
        map.put(a[j],map.getOrDefault(a[j],0)+1);


        while (map.size()>2){
            map.put(a[i],map.get(a[i]-1));

            if (map.get(a[i])==0){
                map.remove(a[i]);
            }
            i++;
        }
        len=Math.max(len,j-i+1);
    }
}
    public static void main(String[] args) {

    }
}
