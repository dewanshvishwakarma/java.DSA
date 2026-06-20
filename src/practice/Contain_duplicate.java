package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Contain_duplicate {
//    approach 1 : with the help of nested loop
    static boolean checkDuplicate1(int[] a){
        for(int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i]==a[j]){
                    return true;
                }
            }
        }
        return false;
    }

//    approach 2: sort and check adjacent array , Sort array → duplicates become adjacent

    static boolean checkDuplicate2(int[] a){
        Arrays.sort(a);
        for (int i=1;i<a.length;i++){
            if (a[i]==a[i-1]){
                return true;
            }
        }
        return false;
    }
//    approach 3: hash map -> count occurrence

    static boolean checkDuplicate3(int[] a){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int num:a){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)==2){
                return true;
            }
        }
        return false;
    }
/*    approach 4:A HashSet stores unique elements only
While traversing:
If element already exists → duplicate found → return true
Else → add it to set*/
    static boolean checkDuplicate4(int[] a){
        HashSet<Integer> set=new HashSet<>();
        for (int num: a){
            if (set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={2,5,6,6,8};
        boolean result1=checkDuplicate1(arr);
        System.out.println(result1);

        boolean result2=checkDuplicate2(arr);
        System.out.println(result2);

        boolean result3=checkDuplicate3(arr);
        System.out.println(result3);

        boolean result4=checkDuplicate4(arr);
        System.out.println(result4);
    }
}
